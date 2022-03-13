package com.mongodb.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.kotlin.createObject
import io.realm.kotlin.where
import io.realm.mongodb.sync.SyncConfiguration
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


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_tournament)

        tournamentNameInput = findViewById(R.id.tournamentName_input)
        typeOfGameInput = findViewById(R.id.tournamentGame_input)
        participantInput = findViewById(R.id.participant_input)
        locationInput = findViewById(R.id.location_input)
        startTimeInput = findViewById(R.id.startTime_input)
        tournamentTypeInput = findViewById(R.id.tournamentType)
        createTourneyButton = findViewById(R.id.createTournamentButton_Button)


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
            val partition = user?.id
            config = SyncConfiguration.Builder(user, partition).build()
            Realm.getInstanceAsync(config, object : Realm.Callback() {
                override fun onSuccess(realm: Realm) {
                    this@CreateTournamentActivity.userRealm = realm
                }
            })
    }

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


        userRealm.executeTransactionAsync { realm ->
            realm.insert(tournament)
        }
    }
}