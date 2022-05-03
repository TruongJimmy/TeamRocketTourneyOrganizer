package com.mongodb.app

import android.content.ContentValues
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import com.mongodb.app.games.GamesListActivity
import kotlinx.android.synthetic.main.rework_home_view.*


class HomeActivity : AppCompatActivity() {
    private lateinit var searchTournamentButton: Button
    private lateinit var createTournamentButton: Button
    private lateinit var settingsButton: Button
    private lateinit var profileButton: Button
    private lateinit var activeButton: Button
    private lateinit var suggestionButton: Button
    private lateinit var rankingButton: Button
    private lateinit var payButton: Button
    private lateinit var reTourneyButton: Button
    private lateinit var tourneyPageButton: Button

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rework_home_view)
        openFragment(ProfileFragment())

        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.profileFragment-> {
                    openFragment(ProfileFragment())
                    return@OnItemSelectedListener true
                }
                R.id.searchFragment-> {
                    openFragment(SearchFragment())
                    return@OnItemSelectedListener true
                }
                R.id.createTourneyFragment -> {
                    openFragment(CreateTourneyFragment())
                    return@OnItemSelectedListener true
                }
                R.id.bracketFragment -> {
                    openFragment(BracketFragment())
                    return@OnItemSelectedListener true
                }
                R.id.settingsFragment -> {
                    openFragment(SettingsFragment())
                    return@OnItemSelectedListener true
                }
            }
            false
        })
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
        activeButton.setOnClickListener { toActiveTourney() }

        suggestionButton = findViewById(R.id.suggestionPageButton)
        suggestionButton.setOnClickListener { toSuggetionPage() }

        rankingButton = findViewById(R.id.memberButton)
        rankingButton.setOnClickListener { toMemberRank() }

        payButton = findViewById(R.id.payPalButton)
        payButton.setOnClickListener { toPaypalPage() }


//        reTourneyButton = findViewById(R.id.reActiveTourneyButton)
//        reTourneyButton.setOnClickListener { toActiveTourney() }

//        tourneyPageButton = findViewById(R.id.tourneyPage)
//        tourneyPageButton.setOnClickListener { toTourneyPage() }

    }

    private fun toTourneyPage (){
        startActivity(Intent(this, TournamentPageActivity::class.java))
    }


    private fun toActiveTourney (){
        startActivity(Intent(this, ActiveUpcomingTournament::class.java))
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
        val intent = Intent(Intent(this, NewProfile::class.java))
//        val email = getIntent().getStringExtra("EMAIL")
//        intent.putExtra("EMAIL", email)
        startActivity(intent)
    }

    private fun openFragment(fragment: Fragment) {
        Log.d(ContentValues.TAG, "openFragment: ")
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayout, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}