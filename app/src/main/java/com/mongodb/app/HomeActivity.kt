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
import com.mongodb.app.games.GamesListActivity
import kotlinx.android.synthetic.main.home_view.*


class HomeActivity : AppCompatActivity() {
    private lateinit var searchTournamentButton: Button
    private lateinit var createTournamentButton: Button
    private lateinit var settingsButton: Button
    private lateinit var profileButton: Button
    private lateinit var activeButton: Button
    private lateinit var suggestionButton: Button
    private lateinit var rankingButton: Button
    private lateinit var payButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_view)
//
//        val bottomNavigationBar = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
//        val navController = findNavController(R.id.fragmentContainerView)
//        val appBarConfiguration = AppBarConfiguration(setOf(R.id.searchFragment, R.id.createTourneyFragment, R.id.profileFragment, R.id.settingsFragment))
//        setupActionBarWithNavController(navController, appBarConfiguration)
//        bottomNavigationBar.setupWithNavController(navController)

        searchTournamentButton = findViewById(R.id.Search_Tournament)
        searchTournamentButton.setOnClickListener {onSearchTournamentButtonClicked()}

        createTournamentButton = findViewById(R.id.Create_Tournament)
        createTournamentButton.setOnClickListener {onCreateTournamentButtonClicked()}

        settingsButton = findViewById(R.id.Settings)
        settingsButton.setOnClickListener {onSettingsButtonClicked()}

        profileButton = findViewById(R.id.Profile)
        profileButton.setOnClickListener {onProfileButtonClicked()}

        activeButton = findViewById(R.id.activeTournament)
        activeButton.setOnClickListener { toBracketActivity() }

        suggestionButton = findViewById(R.id.suggestionPageButton)
        suggestionButton.setOnClickListener { toSuggetionPage() }

        rankingButton = findViewById(R.id.memberButton)
        rankingButton.setOnClickListener { toMemberRank() }

        payButton = findViewById(R.id.payPalButton)
        payButton.setOnClickListener { toPaypalPage() }

    }

    private fun toPaypalPage(){
        startActivity(Intent(this,PaypalActivity::class.java))
    }

    private fun toMemberRank(){
        startActivity(Intent(this,RankingActivity::class.java))
    }

    private fun toSuggetionPage(){
        startActivity(Intent(this,SuggestionPageActivity::class.java))
    }

    private fun onSearchTournamentButtonClicked(){
        startActivity(Intent(this, GamesListActivity::class.java))
    }

    private fun onCreateTournamentButtonClicked(){
        startActivity(Intent(this, CreateTournamentActivity::class.java))
    }

    private fun toBracketActivity(){
        startActivity(Intent(this, BracketActivity::class.java))
    }

    private fun onSettingsButtonClicked(){
        val intent = Intent(Intent(this, SettingsActivity::class.java))
        val email = getIntent().getStringExtra("EMAIL")
        intent.putExtra("EMAIL", email)
        startActivity(intent)
    }

    private fun onProfileButtonClicked(){
        val intent = Intent(Intent(this, ProfileActivity::class.java))
        val email = getIntent().getStringExtra("EMAIL")
        intent.putExtra("EMAIL", email)
        startActivity(intent)
    }
}