package com.mongodb.app
import android.app.AlertDialog
import android.util.Log
import android.view.*
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

import io.realm.mongodb.functions.Functions
import org.bson.Document

/*
* MemberAdapter: extends the Android RecyclerView Adapter to display a collection of Member objects
* in a RecyclerView.
*/

internal class PlayerAdapter(private val data: ArrayList<Player>, private val user : io.realm.mongodb.User) :
    RecyclerView.Adapter<PlayerAdapter.MemberViewHolder>() {
    lateinit var parent: ViewGroup

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PlayerAdapter.MemberViewHolder {
        // save a reference to the parent view so we can create dialogs later
        this.parent = parent
        Log.i(TAG(), "Displaying a list of project members. Size: ${data.size}")
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.player_view, parent, false)
        return MemberViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MemberViewHolder, position: Int) {
        val obj: Player = data[position]
        holder.data = obj
        holder.name.text = obj.name

        holder.delete.setOnClickListener {
            run {
                // Double-check with the user that they would like to remove the user with a dialog
                val dialogBuilder = AlertDialog.Builder(parent.context)
                dialogBuilder.setMessage("Are you sure you want to remove this user from the project?")
                    .setCancelable(true)
                    .setPositiveButton("Remove User") { dialog, _ ->
                        // When the function completes, remember to dismiss the dialog.
                        // If the function successfully removes the team member, remove the team member from the displayed data and notify the Adapter that an item has been removed.
                        val functionsManager: Functions = realmApp.getFunctions(user)
                        functionsManager.callFunctionAsync(
                            "removeTeamMember",
                            listOf(obj.name), Document::class.java
                        ) { result ->
                            run {
                                dialog.dismiss()
                                if (result.isSuccess) {
                                    Log.v(TAG(), "removed team member: ${result.get()}")
                                    data.removeAt(position)
                                    notifyItemRemoved(position)
                                } else {
                                    Log.e(
                                        TAG(),
                                        "failed to remove team member with: " + result.error
                                    )
                                    Toast.makeText(
                                        parent.context,
                                        result.error.toString(),
                                        Toast.LENGTH_LONG
                                    ).show()
                                }
                            }
                        }

                    }
                    .setNegativeButton("Cancel") { dialog, _ ->
                        dialog.cancel()
                    }

                val dialog = dialogBuilder.create()
                dialog.setTitle("Remove Team Member?")
                dialog.show()
            }
        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = data.size

    internal inner class MemberViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var name: TextView = view.findViewById(R.id.name)
        var data: Player? = null
        var delete: TextView = view.findViewById(R.id.delete)

    }
}