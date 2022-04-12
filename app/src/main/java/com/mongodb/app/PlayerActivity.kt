package com.mongodb.app

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import io.realm.mongodb.functions.Functions
import org.bson.Document
import java.util.*


class PlayerActivity : AppCompatActivity() {
    private var user: io.realm.mongodb.User? = null
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: PlayerAdapter
    private lateinit var fab: FloatingActionButton
    private lateinit var members: ArrayList<Player>

    override fun onStart() {
        super.onStart()
        user = realmApp.currentUser()
        if (user == null) {
            // if no user is currently logged in, start the login activity so the user can authenticate
            startActivity(Intent(this, LoginActivity::class.java))
        } else {


            title = "Follow Players"
            setUpRecyclerView()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)

        //Below 2 lines - Back button for this page supported by the toolbar in xml file
        setSupportActionBar(findViewById(R.id.toolBar_FollowingPlayer))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        recyclerView = findViewById(R.id.project_users_list)
        fab = findViewById(R.id.floating_action_button)
        // create a dialog to add a user by email when an item is clicked
        fab.setOnClickListener {
            val input = EditText(this)
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage("Enter user to follow:")
                .setCancelable(true)
                .setPositiveButton("Add User") { dialog, _ ->
                    dialog.dismiss()
                    val functionsManager: Functions = realmApp.getFunctions(user)
                    functionsManager.callFunctionAsync(
                        "addTeamMember",
                        listOf(input.text.toString()),
                        Document::class.java
                    ) { result ->
                        if (result.isSuccess) {
                            Log.v(TAG(), "Attempted to add team member. Result: ${result.get()}")
                            // rebuild the list of members to display the newly-added member
                            setUpRecyclerView()
                        } else {
                            Log.e(TAG(), "failed to add team member with: " + result.error)
                            Toast.makeText(this, result.error.errorMessage, Toast.LENGTH_LONG).show()
                        }
                    }

                }
                .setNegativeButton("Cancel") { dialog, _ ->
                    dialog.cancel()
                }

            val dialog = dialogBuilder.create()
            dialog.setView(input)
            dialog.setTitle("Follow player")
            dialog.show()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        recyclerView.adapter = null
    }

    private fun setUpRecyclerView() {
        // TODO: Call the `getMyTeamMembers` function to get a list of team members, then display them in a RecyclerView
        val functionsManager: Functions = realmApp.getFunctions(user)
    // get team members by calling a Realm Function which returns a list of members
        functionsManager.callFunctionAsync("getUsers", ArrayList<String>(), ArrayList::class.java) { result ->
            if (result.isSuccess) {
                Log.v(TAG(), "successfully fetched team members. Number of team members: ${result.get().size}")
                // The `getMyTeamMembers` function returns team members as Document objects. Convert them into Member objects so the MemberAdapter can display them.
                this.members = ArrayList(result.get().map { item -> Player(item as Document) })
                adapter = PlayerAdapter(members, user!!)
                recyclerView.layoutManager = LinearLayoutManager(this)
                recyclerView.adapter = adapter
                recyclerView.setHasFixedSize(true)
                recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
            } else {
                Log.e(TAG(), "failed to get team members with: " + result.error)
            }
        }

    }
}
