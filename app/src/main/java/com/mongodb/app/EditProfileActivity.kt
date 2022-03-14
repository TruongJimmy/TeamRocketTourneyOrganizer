package com.mongodb.app

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.realm.Realm
import io.realm.RealmConfiguration

class EditProfileActivity: AppCompatActivity() {

    private lateinit var backButton: Button
    private lateinit var profileView: ImageView
    private lateinit var playerName: TextView

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_profile_view)
        backButton = findViewById((R.id.profile_back))
        backButton.setOnClickListener {
            // go to home page after back button is clicked
            startActivity(Intent(this, SettingsActivity::class.java))
        }
        profileView = findViewById((R.id.user_avatar))
        playerName = findViewById((R.id.user_name))
        profileView.setOnClickListener {onProfileClicked()}
    }
    private fun onProfileClicked() {
        profileView.setImageResource(R.drawable.sampleimage_foreground)
    }
}