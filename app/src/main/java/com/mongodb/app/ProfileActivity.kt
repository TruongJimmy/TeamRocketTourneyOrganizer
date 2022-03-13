package com.mongodb.app


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    private lateinit var profileView: ImageView
    private lateinit var playerName: TextView
    private lateinit var followingButton: Button

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_view)

        //Below 2 lines - Back button for this page supported by the toolbar in xml file
//        setSupportActionBar(findViewById(R.id.toolBar_ProfileActivity))
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        profileView = findViewById((R.id.user_avatar_profile))
        playerName = findViewById((R.id.user_name))
        val email = getIntent().getStringExtra("EMAIL")
        //playerName.setText(email.toString())
        followingButton = findViewById((R.id.following))
        followingButton.setOnClickListener {
            // go to home page after back button is clicked
            startActivity(Intent(this, PlayerActivity::class.java))
        }



    }



}


