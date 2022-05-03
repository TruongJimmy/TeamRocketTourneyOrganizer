package com.mongodb.app

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TournamentDetailActivity : AppCompatActivity(){
    private lateinit var gameName: TextView
    private lateinit var tournamentDate: TextView
    private lateinit var prizePool: TextView
    private lateinit var joinButton: Button

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tournament_detail_view)
        gameName = findViewById(R.id.gameName)
        tournamentDate = findViewById(R.id.tournament_date)
        prizePool = findViewById(R.id.prize_pool)
        joinButton = findViewById(R.id.join_button)
    }
}