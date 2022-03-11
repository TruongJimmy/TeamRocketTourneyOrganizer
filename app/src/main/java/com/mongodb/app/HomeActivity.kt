package com.mongodb.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView


class HomeActivity : AppCompatActivity() {
    private lateinit var searchTournamentButton: Button
    private lateinit var createTournamentButton: Button
    private lateinit var settingsButton: Button
    private lateinit var profileButton: Button
    private lateinit var activeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_view)

//        val bottomNavigationBar = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
//        val navController = findNavController(R.id.fragmentContainerView)
//        val appBarConfiguration = AppBarConfiguration(setOf(R.id.bracketActivity, R.id.searchTournamentActivity, R.id.createTournamentActivity))
//        setupActionBarWithNavController(navController, appBarConfiguration)
//        bottomNavigationBar.setupWithNavController(navController)

//        searchTournamentButton = findViewById(R.id.Search_Tournament)
//        searchTournamentButton.setOnClickListener {onSearchTournamentButtonClicked()}
//
//        createTournamentButton = findViewById(R.id.Create_Tournament)
//        createTournamentButton.setOnClickListener {onCreateTournamentButtonClicked()}
//
//        settingsButton = findViewById(R.id.Settings)
//        settingsButton.setOnClickListener {onSettingsButtonClicked()}
//
//        profileButton = findViewById(R.id.Profile)
//        profileButton.setOnClickListener {onProfileButtonClicked()}
//
//        activeButton = findViewById(R.id.activeTournament)
//        activeButton.setOnClickListener { toBracketActivity() }

    }

//    private fun onSearchTournamentButtonClicked(){
//        startActivity(Intent(this,SearchTournamentActivity::class.java))
//    }
//
//    private fun onCreateTournamentButtonClicked(){
//        startActivity(Intent(this, CreateTournamentActivity::class.java))
//    }
//
//    private fun toBracketActivity(){
//        startActivity(Intent(this, BracketActivity::class.java))
//    }
//
//    private fun onSettingsButtonClicked(){
//        val intent = Intent(Intent(this, SettingsActivity::class.java))
//        val email = getIntent().getStringExtra("EMAIL")
//        intent.putExtra("EMAIL", email)
//        startActivity(intent)
//    }
//
//    private fun onProfileButtonClicked(){
//        val intent = Intent(Intent(this, ProfileActivity::class.java))
//        val email = getIntent().getStringExtra("EMAIL")
//        intent.putExtra("EMAIL", email)
//        startActivity(intent)
//    }
}