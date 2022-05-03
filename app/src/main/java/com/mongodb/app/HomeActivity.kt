package com.mongodb.app


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.mongodb.app.activty.CheckoutActivity
import com.mongodb.app.games.GamesListActivity
import java.util.*


class HomeActivity : AppCompatActivity() {
    private lateinit var searchTournamentButton: Button
    private lateinit var createTournamentButton: Button
    private lateinit var settingsButton: Button
    private lateinit var profileButton: Button
    private lateinit var activeButton: Button
    private lateinit var suggestionButton: Button
    private lateinit var rankingButton: Button
    private lateinit var payButton: Button
    private lateinit var brackets: Button
    private lateinit var tourneyPageButton: Button
    private lateinit var group: Button
    private lateinit var message: Button
    private lateinit var userEmail: TextView
    private lateinit var rateButton: Button
    private lateinit var gPay: Button

    // lateinit var timerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_view)

        val bundle: Bundle? = intent.extras
        var currentEmail: String? = null
        if (bundle != null) {
            currentEmail = bundle.getString("EMAIL")
        }
        userEmail = findViewById(R.id.email)
        userEmail.text = currentEmail
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

        payButton = findViewById(R.id.payPalButton)
        payButton.setOnClickListener { toPaypalPage() }

        group = findViewById(R.id.groupButton)
        group.setOnClickListener { toGroupPage() }

        message = findViewById(R.id.messageButton)
        message.setOnClickListener { toChatRoom() }

        rateButton = findViewById(R.id.ratingsPage)
        rateButton.setOnClickListener { toMyRatingsPage() }
//        timerButton = findViewById(R.id.timerButton)
//        timerButton.setOnClickListener { toTimerPage() }


        brackets = findViewById(R.id.brackets)
        brackets.setOnClickListener { toBracketActivity() }

//        tourneyPageButton = findViewById(R.id.tourneyPage)
//        tourneyPageButton.setOnClickListener { toTourneyPage() }
//
//        gPay = findViewById(R.id.googlePayButton)
//        gPay.setOnClickListener { toPaypalPage() }

    }


    private fun toMyRatingsPage() {
        val intent = Intent(Intent(this, MyRatingsActivity::class.java))
        intent.putExtra("EMAIL", userEmail.text)
        startActivity(intent)
    }


    private fun toChatRoom (){
        startActivity(Intent(this, ChatRoom::class.java))
    }

    private fun toGroupPage (){
        startActivity(Intent(this, CreateGroupActivity::class.java))
    }

    private fun toTimerPage (){
        startActivity(Intent(this, TimerActivity::class.java))
    }


    private fun toTourneyPage (){
        startActivity(Intent(this, TournamentPageActivity::class.java))
    }


    private fun toActiveTourney (){
        startActivity(Intent(this, ActiveUpcomingTournament::class.java))
    }


    private fun toPaypalPage(){
        startActivity(Intent(this,CheckoutActivity::class.java))
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
}