package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0014J\b\u0010\u0013\u001a\u00020\u000fH\u0014J\b\u0010\u0014\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/mongodb/app/PlayerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/mongodb/app/PlayerAdapter;", "fab", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "members", "Ljava/util/ArrayList;", "Lcom/mongodb/app/Player;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "user", "Lio/realm/mongodb/User;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onStart", "setUpRecyclerView", "app_debug"})
public final class PlayerActivity extends androidx.appcompat.app.AppCompatActivity {
    private io.realm.mongodb.User user;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private com.mongodb.app.PlayerAdapter adapter;
    private com.google.android.material.floatingactionbutton.FloatingActionButton fab;
    private java.util.ArrayList<com.mongodb.app.Player> members;
    private java.util.HashMap _$_findViewCache;
    
    public PlayerActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void setUpRecyclerView() {
    }
}