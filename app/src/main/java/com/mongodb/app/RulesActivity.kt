package com.mongodb.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.mongodb.sync.SyncConfiguration
import kotlinx.android.synthetic.main.activity_rules.*

class RulesActivity : AppCompatActivity() {
    private lateinit var rules: EditText
    private lateinit var doneButton: Button
    private lateinit var userRealm: Realm
    private lateinit var config: RealmConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rules)

        rules = findViewById(R.id.rulesText)
        doneButton = findViewById(R.id.rulesDoneButton)

        doneButton.setOnClickListener{ setRules() }

    }

    /**
     * Creates Realm instance to able to read and write
     */
    override fun onStart() {
        super.onStart()

        val user = realmApp.currentUser()
        val partition = "123" //user.id
        config = SyncConfiguration.Builder(user, partition).build()
        Realm.getInstanceAsync(config, object : Realm.Callback() {
            override fun onSuccess(realm: Realm) {
                this@RulesActivity.userRealm = realm
            }
        })
    }


    /**
     * Destroys the User Realm when exiting the activity
     */
    override fun onDestroy() {
        super.onDestroy()
        userRealm.close()
    }

    private fun setRules() {
        val tournament = Tournament()
        val intent = Intent(this@RulesActivity, CreateTournamentActivity::class.java)
        tournament.rules = rules.text.toString()

        if (rules.length() > 0) {
            intent.putExtra("rules", tournament.rules)
            Toast.makeText(this, "Created Rules", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "No Rules Has Been Passed", Toast.LENGTH_LONG).show()
        }
        startActivity(intent)
    }


}