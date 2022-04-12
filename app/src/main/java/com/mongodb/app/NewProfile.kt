package com.mongodb.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_new_profile.*

class NewProfile : AppCompatActivity() {
    private lateinit var profileName: TextView
    private lateinit var profileEmail: TextView
    private lateinit var follow: TextView
    private lateinit var tIn: Button
    private lateinit var tOwn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_profile)

        profileName = findViewById(R.id.tv_name)
        profileEmail = findViewById(R.id.profileEmail)
        tIn = findViewById(R.id.tournamentsIn)
        tOwn = findViewById(R.id.tournamentsOwn)
        follow = findViewById(R.id.following)
        following.setOnClickListener{
            startActivity(Intent(this, PlayerActivity::class.java))
        }

//        var bundle: Bundle? = intent.extras
//        var userEmail= bundle!!.getString("EMAIL")
//
//
//        profileEmail.text = userEmail
//        profileName.text = userEmail

        tOwn.setOnClickListener{
            showTournamentsOwn()
        }
        tIn.setOnClickListener{
            showTournamentsIn()
        }
    }
    private fun showTournamentsOwn() {
        startActivity(Intent(this, TournamentsOwnActivity::class.java))
    }
    private fun showTournamentsIn() {
        startActivity(Intent(this, TournamentsInActivity::class.java))
    }
}
