package com.mongodb.tasktracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import io.realm.mongodb.Credentials

// : means extends just like in Java
class RegisterActivity : AppCompatActivity() {
    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var confirmPassword: EditText
    private lateinit var confirmEmail: EditText
    private lateinit var email: EditText
    private lateinit var regButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        username = findViewById(R.id.inputUsername)
        email = findViewById(R.id.inputEmail)
        confirmEmail = findViewById(R.id.inputConfirmEmail)
        password = findViewById(R.id.inputPassword)
        confirmPassword = findViewById(R.id.inputConfirmPassword)
        regButton = findViewById(R.id.buttonRegister)

        regButton.setOnClickListener { toRegister(true) }

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

    // Checks the input area in Register page if it's empty or not
    private fun validateNonEmptyInputs(): Boolean = when {
        // zero-length usernames and passwords are not valid (or secure), so prevent users from creating accounts with those client-side.
        username.text.toString().isEmpty() -> false
        email.text.toString().isEmpty() -> false
        confirmEmail.text.toString().isEmpty() -> false
        password.text.toString().isEmpty() -> false
        confirmPassword.text.toString().isEmpty() -> false
        else -> true
    }

    /**
     * To register new users using username, email, and password.
     * Checks if user is creating new user and then registers the user in the mongodb database
     */
    private fun toRegister(createUser: Boolean) {
        if (!validateNonEmptyInputs()) {
            onLoginFailed("Invalid and Empty")
            return
        }

        //To register
        //Checks if email and passwords are the same and if the input area is NOT empty
            //val username = this.username.text.toString()
            val password = this.password.text.toString()
            val confirmPassword = this.confirmPassword.text.toString()
            val email = this.email.text.toString()
            val confirmEmail = this.confirmEmail.text.toString()

            regButton.isEnabled = false

            //Checks if both email and password match - FINISHED
            if (email != confirmEmail || password != confirmPassword || !validateNonEmptyInputs()) {
                onLoginFailed("Failed the test.")
            } else {
                taskApp.emailPassword.registerUserAsync(confirmEmail, confirmPassword) {
                    // re-enable the buttons after user registration returns a result
                    regButton.isEnabled = true
                    if (it.isSuccess) {
                        onLoginFailed("Could not register user.")
                        Log.e(TAG(), "Error: ${it.error}")
                    } else {
                        Log.i(TAG(), "Successfully registered user.")
                    }
                }
            }
    }
}