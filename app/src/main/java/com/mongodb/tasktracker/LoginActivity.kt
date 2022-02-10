package com.mongodb.tasktracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import io.realm.mongodb.Credentials
/*
* LoginActivity: launched whenever a user isn't already logged in. Allows a user to enter email
* and password credentials to log in to an existing account or create a new account.
*/
class LoginActivity : AppCompatActivity() {
    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var loginButton: Button
    private lateinit var createUserButton: Button
    private lateinit var registerButton: Button
    private lateinit var createTourney: Button


    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        username = findViewById(R.id.input_username)
        password = findViewById(R.id.input_password)
        loginButton = findViewById(R.id.button_login)
        createUserButton = findViewById(R.id.button_create)
        registerButton = findViewById(R.id.registerButton)
        createTourney = findViewById(R.id.createTournamentButton)

        loginButton.setOnClickListener { login(false) }
        //createUserButton.setOnClickListener { login(true) }

        //to go to Register Activity page
        registerButton.setOnClickListener { toRegisterActivity() }

        //FOR TESTING PURPOSES(DELETE LATER) to go to Create Tournament Page
        createTourney.setOnClickListener { toCreateTournamentActivity() }

    }

    override fun onBackPressed() {
        // Disable going back to the MainActivity
        moveTaskToBack(true)
    }

    //Syntax for going to one activity to another activity
    private fun toCreateTournamentActivity() {
        val intent = Intent(this, CreateTournamentActivity::class.java)
        startActivity(intent)
    }

    //Syntax for going to one activity to another activity
    private fun toRegisterActivity() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }


    private fun onLoginSuccess() {
        // successful login ends this activity, bringing the user back to the project activity
        finish()
    }

    private fun onLoginFailed(errorMsg: String) {
        Log.e(TAG(), errorMsg)
        Toast.makeText(baseContext, errorMsg, Toast.LENGTH_LONG).show()
    }

    private fun validateCredentials(): Boolean = when {
        // zero-length usernames and passwords are not valid (or secure), so prevent users from creating accounts with those client-side.
        username.text.toString().isEmpty() -> false
        password.text.toString().isEmpty() -> false
        else -> true
    }

    // handle user authentication (login) and account creation
    private fun login(createUser: Boolean) {
        if (!validateCredentials()) {
            onLoginFailed("Invalid username or password")
            return
        }



        // while this operation completes, disable the buttons to login or create a new account
        createUserButton.isEnabled = false
        loginButton.isEnabled = false

        val username = this.username.text.toString()
        val password = this.password.text.toString()


        if (createUser) {
            // register a user using the Realm App we created in the TaskTracker class
            // TODO: Register a new user with the supplied username and password when the "Create" button is pressed.
            taskApp.emailPassword.registerUserAsync(username, password) {
                // re-enable the buttons after user registration returns a result
                createUserButton.isEnabled = true
                loginButton.isEnabled = true
                if (!it.isSuccess) {
                    onLoginFailed("Could not register user.")
                    Log.e(TAG(), "Error: ${it.error}")
                } else {
                    Log.i(TAG(), "Successfully registered user.")
                    // when the account has been created successfully, log in to the account
                    login(false)
                }
            }
        } else {
            // TODO: Log in with the supplied username and password when the "Log in" button is pressed.
            val creds = Credentials.emailPassword(username, password)
            taskApp.loginAsync(creds) {
                // re-enable the buttons after user login returns a result
                loginButton.isEnabled = true
                createUserButton.isEnabled = true
                if (!it.isSuccess) {
                    onLoginFailed(it.error.message ?: "An error occurred.")
                } else {
                    onLoginSuccess()
                }
            }
            onLoginFailed("Couldn't log in. Configure your App ID and login handler.")
        }

        // If user taps on the create user button, it will transition to the Create Account Register Page


    }


}