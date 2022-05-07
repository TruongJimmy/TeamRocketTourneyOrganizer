package com.mongodb.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.DocumentsContract
import android.util.Log
import android.widget.*
import com.cometchat.pro.constants.CometChatConstants
import com.cometchat.pro.constants.CometChatConstants.Params.UID
import com.cometchat.pro.core.CometChat
import com.cometchat.pro.exceptions.CometChatException
import com.cometchat.pro.models.Group
import com.cometchat.pro.models.GroupMember
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.kotlin.createObject
import io.realm.kotlin.where
import io.realm.mongodb.functions.Functions
import io.realm.mongodb.sync.SyncConfiguration
import kotlinx.android.synthetic.main.activity_create_tournament.*
import org.bson.Document
import java.time.LocalDateTime
import java.util.*

class CreateTournamentActivity : AppCompatActivity() {
    private lateinit var tournamentNameInput: EditText
    private lateinit var typeOfGameInput: EditText
    private lateinit var participantInput: EditText
    private lateinit var locationInput: EditText
    private lateinit var startTimeInput: EditText
    private lateinit var tournamentTypeInput: EditText
    private lateinit var createTourneyButton: Button
    private lateinit var userRealm: Realm
    private lateinit var config: RealmConfiguration
    private var user: io.realm.mongodb.User? = null
    private lateinit var prize: TextView
    private lateinit var rules: TextView
    private lateinit var logo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_tournament)
        user = realmApp.currentUser()

        logo = findViewById(R.id.createLogo)
        tournamentNameInput = findViewById(R.id.tournamentName_input)
        typeOfGameInput = findViewById(R.id.tournamentGame_input)
        participantInput = findViewById(R.id.participant_input)
        locationInput = findViewById(R.id.location_input)
        startTimeInput = findViewById(R.id.startTime_input)
        tournamentTypeInput = findViewById(R.id.tournamentType)
        createTourneyButton = findViewById(R.id.createTournamentButton_Button)
        prize = findViewById(R.id.pAmount)
        rules = findViewById(R.id.rulesInput)


        //Below 2 lines - Back button for this page supported by the toolbar in xml file
//        setSupportActionBar(findViewById(R.id.toolBar_createTournamentActivity))
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //Creates tournament in database
        createTourneyButton.setOnClickListener { (createTournament()) }
    }


    /**
     * Creates Realm instance to able to read and write
     */
    override fun onStart() {
        super.onStart()

        val user = realmApp.currentUser()
            val partition = "123" //user.id
            config = SyncConfiguration.Builder(user, partition).build()
            Realm.getInstanceAsync(config, object : Realm.Callback() {
                override fun onSuccess(realm: Realm) {
                    this@CreateTournamentActivity.userRealm = realm
                }
            })
    }

//    private fun createGroupChat() {
//        val GUID:String="GUID"
//        val groupName:String=tournamentNameInput.text.toString()
//        val groupType:String=CometChatConstants.GROUP_TYPE_PUBLIC
//        val password:String=""
//
//        val group= com.cometchat.pro.models.Group(GUID, groupName, groupType, password)
//
//        CometChat.createGroup(group,object :CometChat.CallbackListener<com.cometchat.pro.models.Group>(){
//            override fun onSuccess(p0: Group?) {
//                addMembersToGroupChat(GUID)
//            }
//            override fun onError(p0: CometChatException?) {
//
//            }
//        })
//    }
//
//    private fun addMembersToGroupChat(GUID: String) {
//        val member:MutableList<GroupMember> = arrayListOf()
//        member.add(GroupMember(UID,CometChatConstants.SCOPE_PARTICIPANT))
//
//        CometChat.addMembersToGroup(GUID,member,null,object :CometChat.CallbackListener<HashMap<String,String>>(){
//
//            override fun onSuccess(p0: HashMap<String, String>?) {
//            }
//
//            override fun onError(p0: CometChatException?) {
//
//            }
//
//        })
//    }

    /**
     * Destroys the User Realm when exiting the activity
     */
    override fun onDestroy() {
        super.onDestroy()
        userRealm.close()
    }

    private fun createTournament() {
        val tournament = Tournament()

        tournament.game = typeOfGameInput.text.toString()
        tournament.location = locationInput.text.toString()
        tournament.name = tournamentNameInput.text.toString()
        tournament.participant = participantInput.text.toString()
        tournament.startTime = startTimeInput.text.toString()
        tournament.tournamentType = tournamentTypeInput.text.toString()
        tournament.prizeAmount = prize.text.toString()
        tournament.rules = rules.text.toString()

        userRealm.executeTransactionAsync { realm ->
            realm.insert(tournament)
        }

        val functionsManager: Functions = realmApp.getFunctions(user)
        functionsManager.callFunctionAsync(
            "addTournamentOwner",
            listOf(tournament.name), // game name
            Document::class.java
        ) { result ->
            if (result.isSuccess) {
                Log.v(TAG(), "Attempted to add participant. Result: ${result.get()}")
            } else {
                Log.e(TAG(), "failed to add participant with: " + result.error)
                Toast.makeText(this, result.error.errorMessage, Toast.LENGTH_LONG).show()
            }
        }
        // Assign owner to tournament
        functionsManager.callFunctionAsync(
            "addTournamentOwnedBy",
            listOf(tournament.name), // game name
            Document::class.java
        ) { result ->
            if (result.isSuccess) {
                Log.v(TAG(), "Attempted to add participant. Result: ${result.get()}")
            } else {
                Log.e(TAG(), "failed to add participant with: " + result.error)
                Toast.makeText(this, result.error.errorMessage, Toast.LENGTH_LONG).show()
            }
        }


        startActivity(Intent(this,HomeActivity::class.java))
    }


//        userRealm.executeTransactionAsync { realm ->
//            realm.insert(tournament)
//        }
//        startActivity(Intent(this,HomeActivity::class.java))
//
//
//    }
}