package com.mongodb.app

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NewProfile : AppCompatActivity() {
    private lateinit var profileName: TextView
    private lateinit var profileEmail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_profile)

//        profileName = findViewById(R.id.tv_name)
//        profileEmail = findViewById(R.id.profileEmail)

//        var bundle: Bundle? = intent.extras
//        var userEmail= bundle!!.getString("EMAIL")
//
//        profileEmail.text = userEmail
//        profileName.text = userEmail
    }
}