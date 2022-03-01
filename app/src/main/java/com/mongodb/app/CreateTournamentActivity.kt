package com.mongodb.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import io.realm.Realm
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
        setSupportActionBar(findViewById(R.id.toolBar_createTournamentActivity))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        createTourneyButton.setOnClickListener { (createTournament()) }


    }

    private fun createTournament() {
        val tournament = Tournament()
        tournament.game = "HI"
        tournament.name = "Fred"
        tournament.participant = "32"
        tournament.location = "fdsa"
        tournament.date = "DF"
        tournament.tournamentType = "DFSF"

        userRealm.executeTransactionAsync { realm ->
            realm.insert(tournament)
        }
    }
}