package com.mongodb.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_tournament_page.*

class TournamentPageActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<TournamentPageAdapter.ViewHolder>? = null
    private lateinit var participants: TextView
    private lateinit var tourneyName: TextView
    private lateinit var prize: TextView
    private lateinit var tourneyGame: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tournament_page)


        participants = findViewById(R.id.participantNumber)
        prize = findViewById(R.id.prizeAmount)
        tourneyName = findViewById(R.id.tournamentName)
        tourneyGame = findViewById(R.id.tournamentGame)


        var bundle: Bundle? = intent.extras
        var participantCall = bundle!!.getString("participant")
        var tourneyNameCall = bundle!!.getString("tourneyName")
        var tourneyGameCall = bundle!!.getString("tourneyGame")
        var location = bundle!!.getString("location")
        var startTime = bundle!!.getString("startTime")
        var tournamentType = bundle!!.getString("tournamentType")
        var tourneyPicture = bundle!!.getString("tourneyPicture")

        var title = arrayOf("Tournament Bracket", "Tournament Type", "Location", "Start Time", "Game", "Participants", "Rules", "Contact TO", "Chat Room")
        var details = arrayOf("Tap to see bracket", tournamentType, location, startTime, tourneyGameCall, participantCall, "Tap for details", "TO Name", "Text with other participants")
        var images = intArrayOf(R.drawable.ic_bracket, R.drawable.ic_type, R.drawable.ic_location, R.drawable.ic_time, R.drawable.ic_game, R.drawable.ic_person, R.drawable.ic_rules, R.drawable.ic_send, R.drawable.ic_chat)
        participants.text = participantCall
        tourneyName.text = tourneyNameCall
        tourneyGame.text = tourneyGameCall


        layoutManager = LinearLayoutManager(this)
        recyclerViewTourneyPage.layoutManager = layoutManager

        adapter = TournamentPageAdapter(title, details, images)
        recyclerViewTourneyPage.adapter = adapter
    }
}

