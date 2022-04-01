package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014R\u001a\u0010\u0003\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/mongodb/app/TournamentPageActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/mongodb/app/TournamentPageAdapter$ViewHolder;", "Lcom/mongodb/app/TournamentPageAdapter;", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "participants", "Landroid/widget/TextView;", "prize", "tourneyGame", "tourneyName", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class TournamentPageActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
    private androidx.recyclerview.widget.RecyclerView.Adapter<com.mongodb.app.TournamentPageAdapter.ViewHolder> adapter;
    private android.widget.TextView participants;
    private android.widget.TextView tourneyName;
    private android.widget.TextView prize;
    private android.widget.TextView tourneyGame;
    private java.util.HashMap _$_findViewCache;
    
    public TournamentPageActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}