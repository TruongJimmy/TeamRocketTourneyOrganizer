package com.mongodb.app

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.DocumentsContract
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.realm.Realm
import io.realm.mongodb.functions.Functions
import kotlinx.android.synthetic.main.activity_tournament_page.*
import org.bson.Document

class TournamentPageActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<TournamentPageAdapter.ViewHolder>? = null
    private lateinit var participants: TextView
    private lateinit var tourneyName: TextView
    private lateinit var prize: TextView
    private lateinit var tourneyGame: TextView
    private lateinit var tourneyImage: ImageView
    private var moneySign = "$"
    private lateinit var join: Button
    private var user: io.realm.mongodb.User? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tournament_page)
        user = realmApp.currentUser()

        participants = findViewById(R.id.participantNumber)
        prize = findViewById(R.id.prizeAmount)
        tourneyName = findViewById(R.id.tournamentName)
        tourneyGame = findViewById(R.id.tournamentGame)
        tourneyImage = findViewById(R.id.tournamentImage)
        join = findViewById(R.id.joinButton)

        var bundle: Bundle? = intent.extras
        var participantCall = bundle!!.getString("participant")
        var tourneyNameCall = bundle!!.getString("tourneyName")
        var tourneyGameCall = bundle!!.getString("tourneyGame")
        var location = bundle!!.getString("location")
        var startTime = bundle!!.getString("startTime")
        var tournamentType = bundle!!.getString("tournamentType")
        var prizeAmount = bundle!!.getString("prizeAmount")
        var tourneyPicture = bundle!!.getString("tourneyPicture")

        var title = arrayOf("Tournament Bracket", "Tournament Type", "Location", "Start Time", "Game", "Participants", "Rules", "Contact TO", "Chat Room")
        var details = arrayOf("Tap to see bracket", tournamentType, location, startTime, tourneyGameCall, participantCall, "Tap for details", "TO Name", "Text with other participants")
        var images = intArrayOf(R.drawable.ic_bracket, R.drawable.ic_type, R.drawable.ic_location, R.drawable.ic_time, R.drawable.ic_game, R.drawable.ic_person, R.drawable.ic_rules, R.drawable.ic_send, R.drawable.ic_chat)
        participants.text = participantCall
        tourneyName.text = tourneyNameCall
        tourneyGame.text = tourneyGameCall
        prize.text = moneySign + prizeAmount

        //Setting the game image
        if (tourneyGameCall != null) {
            setTourneyImage(tourneyGameCall)
        }

        participants.setOnClickListener {
            val intent = Intent(this@TournamentPageActivity, ParticipantActivity::class.java)
            intent.putExtra("tourneyName", tourneyNameCall)
            startActivity(intent)
        }

        join.setOnClickListener{
            val functionsManager: Functions = realmApp.getFunctions(user)
            functionsManager.callFunctionAsync(
                "addParticipant",
                listOf(tourneyNameCall), // game name
                Document::class.java
            ) { result ->
                if (result.isSuccess) {
                    Log.v(TAG(), "Attempted to add participant. Result: ${result.get()}")
                    Toast.makeText(this, "Joined tournament", Toast.LENGTH_LONG).show()
                } else {
                    Log.e(TAG(), "failed to add participant with: " + result.error)
                    Toast.makeText(this, result.error.errorMessage, Toast.LENGTH_LONG).show()
                }
            }
        }



        layoutManager = LinearLayoutManager(this)
        recyclerViewTourneyPage.layoutManager = layoutManager

        adapter = TournamentPageAdapter(title, details, images)
        recyclerViewTourneyPage.adapter = adapter
    }

    private fun setTourneyImage(tourneyGameName: String) {
        if (tourneyGameName == "Valorant") {
            tourneyImage.setImageResource(R.mipmap.valorant_foreground)
        } else if (tourneyGameName == "Fortnite") {
            tourneyImage.setImageResource(R.mipmap.fortnite_foreground)
        } else if (tourneyGameName == "Apex Legends") {
            tourneyImage.setImageResource(R.mipmap.apex_foreground)
        } else if (tourneyGameName == "Dragon Ball FighterZ") {
            tourneyImage.setImageResource(R.mipmap.dbz_foreground)
        } else if (tourneyGameName == "Super Smash Bros.") {
            tourneyImage.setImageResource(R.mipmap.smash_foreground)
        } else if (tourneyGameName == "League of Legends") {
            tourneyImage.setImageResource(R.mipmap.lol_foreground)
        } else if (tourneyGameName == "Dota") {
            tourneyImage.setImageResource(R.mipmap.dota_foreground)
        } else if (tourneyGameName == "Counter-Strike: Global Offensive") {
            tourneyImage.setImageResource(R.mipmap.csgo_foreground)
        } else if (tourneyGameName == "Tom Clancy's Rainbow Six Siege") {
            tourneyImage.setImageResource(R.mipmap.r6_foreground)
        } else if (tourneyGameName == "Rocket League") {
            tourneyImage.setImageResource(R.mipmap.rocket_foreground)
        } else {
            tourneyImage.setImageResource(R.mipmap.dbz_foreground)
        }
    }
}

