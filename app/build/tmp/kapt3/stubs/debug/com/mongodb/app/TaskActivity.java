package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0014J\b\u0010\u0012\u001a\u00020\nH\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\nH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/mongodb/app/TaskActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "config", "Lio/realm/RealmConfiguration;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "userRealm", "Lio/realm/Realm;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onDestroy", "onFabClicked", "onOptionsItemSelected", "menuItem", "Landroid/view/MenuItem;", "onStart", "app_debug"})
public final class TaskActivity extends androidx.appcompat.app.AppCompatActivity {
    private io.realm.Realm userRealm;
    private io.realm.RealmConfiguration config;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private java.util.HashMap _$_findViewCache;
    
    public TaskActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * On start, open a realm with a partition ID equal to the user ID.
     * Query the realm for Task objects, sorted by a stable order that remains
     * consistent between runs, and display the collection using a recyclerView.
     */
    @java.lang.Override()
    protected void onStart() {
    }
    
    /**
     * Add buttons to the task menu.
     */
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    /**
     * Decides actions for all buttons on the task menu.
     * When "log out" is tapped, logs out the user and brings them back to the login screen.
     */
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem) {
        return false;
    }
    
    /**
     * Creates a popup that allows the user to insert a task into the realm.
     */
    private final void onFabClicked() {
    }
    
    /**
     * Ensure the user realm closes when the activity ends.
     */
    @java.lang.Override()
    protected void onDestroy() {
    }
}