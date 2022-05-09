package com.mongodb.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.kotlin.where
import io.realm.mongodb.sync.SyncConfiguration
import kotlinx.android.synthetic.main.activity_new_profile.*

class NewProfile : AppCompatActivity() {
    private lateinit var profileName: TextView
    private lateinit var profileEmail: TextView
    private lateinit var follow: TextView
    private lateinit var tIn: Button
    private lateinit var tOwn: Button
    private lateinit var userRealm: Realm
    private lateinit var config: RealmConfiguration
    private lateinit var rating: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_profile)

        profileName = findViewById(R.id.tv_name)
        profileEmail = findViewById(R.id.profileEmail)
        tIn = findViewById(R.id.tournamentsIn)
        tOwn = findViewById(R.id.tournamentsOwn)
        follow = findViewById(R.id.following)
        rating = findViewById(R.id.viewRatings)

        val user = realmApp.currentUser()
        val partition = "123"

        rating.setOnClickListener{ toRatingsPage() }

        config = SyncConfiguration.Builder(user, partition).build()
        Realm.getInstanceAsync(config, object : Realm.Callback() {
            override fun onSuccess(realm: Realm) {
                this@NewProfile.userRealm = realm
                val realmResults = realm.where<User>().findAll()
                follow.text = (realmResults.size-1).toString()
            }
        })

        following.setOnClickListener{
            startActivity(Intent(this, PlayerActivity::class.java))
        }

        var bundle: Bundle? = intent.extras
        var userEmail= bundle!!.getString("EMAIL")


        profileEmail.text = userEmail
        profileName.text = userEmail

        tOwn.setOnClickListener{
            showTournamentsOwn()
        }
        tIn.setOnClickListener{
            showTournamentsIn()
        }
    }

    private fun toRatingsPage() {
        val intent = Intent(Intent(this, MyRatingsActivity::class.java))
        intent.putExtra("EMAIL", profileEmail.text)
        startActivity(intent)
    }
    private fun showTournamentsOwn() {
        val intent = Intent(Intent(this, TournamentsOwnActivity::class.java))
        intent.putExtra("EMAIL", profileEmail.text.toString())
        startActivity(intent)
    }
    private fun showTournamentsIn() {
        val intent = Intent(Intent(this, TournamentsInActivity::class.java))
        intent.putExtra("EMAIL", profileEmail.text.toString())
        startActivity(intent)
    }
}
