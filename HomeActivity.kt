package com.example.homepageforbudokai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    private lateinit var Search_Tournament: Button
    private lateinit var Create_Tournament: Button
    private lateinit var Settings: Button
    private lateinit var Profile: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.Homepage)
        Search_Tournament.setOnClickListener {onSearchTournamentButtonClicked()}

        Create_Tournament.setOnClickListener {onCreateTournamentButtonClicked()}

        Settings.setOnClickListener {onSettingsButtonClicked()}

        Profile.setOnClickListener {onProfileButtonClicked()}

    }

    private fun onSearchTournamentButtonClicked(){
        //startActivity(this, Search Tournament::class.java))
    }

    private fun onCreateTournamentButtonClicked(){
        //startActivity(this, Create Tournament::class.java))
    }

    private fun onSettingsButtonClicked(){
        //startActivity(this, Settings::class.java))
    }

    private fun onProfileButtonClicked(){
        //startActivity(this, Profile::class.java))
    }
}