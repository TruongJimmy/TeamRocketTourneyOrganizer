package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0015H\u0014J\b\u0010\u001a\u001a\u00020\u0015H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/mongodb/app/CreateTournamentActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "config", "Lio/realm/RealmConfiguration;", "createTourneyButton", "Landroid/widget/Button;", "locationInput", "Landroid/widget/EditText;", "participantInput", "prize", "Landroid/widget/TextView;", "startTimeInput", "tournamentNameInput", "tournamentTypeInput", "typeOfGameInput", "user", "Lio/realm/mongodb/User;", "userRealm", "Lio/realm/Realm;", "createTournament", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onStart", "app_debug"})
public final class CreateTournamentActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.widget.EditText tournamentNameInput;
    private android.widget.EditText typeOfGameInput;
    private android.widget.EditText participantInput;
    private android.widget.EditText locationInput;
    private android.widget.EditText startTimeInput;
    private android.widget.EditText tournamentTypeInput;
    private android.widget.Button createTourneyButton;
    private io.realm.Realm userRealm;
    private io.realm.RealmConfiguration config;
    private io.realm.mongodb.User user;
    private android.widget.TextView prize;
    private java.util.HashMap _$_findViewCache;
    
    public CreateTournamentActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Creates Realm instance to able to read and write
     */
    @java.lang.Override()
    protected void onStart() {
    }
    
    /**
     * Destroys the User Realm when exiting the activity
     */
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void createTournament() {
    }
}