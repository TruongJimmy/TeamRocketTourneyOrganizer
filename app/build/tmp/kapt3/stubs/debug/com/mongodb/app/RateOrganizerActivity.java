package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0014J\b\u0010\u0016\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/mongodb/app/RateOrganizerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "config", "Lio/realm/RealmConfiguration;", "description", "Landroid/widget/EditText;", "organizer", "starRating", "Landroid/widget/RatingBar;", "submitButton", "Landroid/widget/Button;", "user", "Lio/realm/mongodb/User;", "userRealm", "Lio/realm/Realm;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onStart", "rateOrganizer", "app_debug"})
public final class RateOrganizerActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.widget.RatingBar starRating;
    private android.widget.EditText organizer;
    private android.widget.EditText description;
    private android.widget.Button submitButton;
    private io.realm.Realm userRealm;
    private io.realm.RealmConfiguration config;
    private io.realm.mongodb.User user;
    private java.util.HashMap _$_findViewCache;
    
    public RateOrganizerActivity() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
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
    
    private final void rateOrganizer() {
    }
}