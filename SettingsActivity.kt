package com.mongodb.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class SettingsActivity: AppCompatActivity() {
    private lateinit var editProfileButton: Button
    private lateinit var changePasswordButton: Button
    private lateinit var helpButton: Button
    private lateinit var backButton: Button

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings)
        editProfileButton = findViewById(R.id.button_edit_profile)
        editProfileButton.setOnClickListener {onEditProfileButtonClicked()}

        changePasswordButton = findViewById(R.id.button_change_pass)
        changePasswordButton.setOnClickListener { onChangePassButtonClicked() }

        helpButton = findViewById((R.id.button_help))
        helpButton.setOnClickListener { }
        backButton = findViewById((R.id.button_back))
        backButton.setOnClickListener {onBackButtonClicked()}
    }
    private fun onEditProfileButtonClicked() {
        startActivity(Intent(this, EditProfileActivity::class.java))

    }

    private fun onChangePassButtonClicked() {
        // startActivity(Intent(this, ChangePassActivity::class.java))
    }

    private fun onHelpButtonClicked() {
        // startActivity(Intent(this, HelpActivity::class.java))
    }

    private fun onBackButtonClicked() {
        startActivity(Intent(this, HomeActivity::class.java))
    }

}
