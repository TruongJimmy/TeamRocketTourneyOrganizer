package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014R\u001a\u0010\u0003\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \t*\u0004\u0018\u00010\u00150\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R2\u0010\u0016\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00180\u0018 \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00180\u0018\u0018\u00010\u00170\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/mongodb/app/ActiveUpcomingTournament;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/mongodb/app/ActiveUpcomingAdapter$ViewHolder;", "Lcom/mongodb/app/ActiveUpcomingAdapter;", "config", "Lio/realm/mongodb/sync/SyncConfiguration;", "kotlin.jvm.PlatformType", "getConfig", "()Lio/realm/mongodb/sync/SyncConfiguration;", "setConfig", "(Lio/realm/mongodb/sync/SyncConfiguration;)V", "images", "", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "partition", "", "realm", "Lio/realm/Realm;", "tourneyQuery", "Lio/realm/RealmResults;", "Lcom/mongodb/app/Tournament;", "user", "Lio/realm/mongodb/User;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class ActiveUpcomingTournament extends androidx.appcompat.app.AppCompatActivity {
    private androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
    private androidx.recyclerview.widget.RecyclerView.Adapter<com.mongodb.app.ActiveUpcomingAdapter.ViewHolder> adapter;
    private io.realm.mongodb.User user;
    private java.lang.String partition = "123";
    private io.realm.mongodb.sync.SyncConfiguration config;
    private io.realm.Realm realm;
    private io.realm.RealmResults<com.mongodb.app.Tournament> tourneyQuery;
    private int[] images = {com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round};
    private java.util.HashMap _$_findViewCache;
    
    public ActiveUpcomingTournament() {
        super();
    }
    
    public final io.realm.mongodb.sync.SyncConfiguration getConfig() {
        return null;
    }
    
    public final void setConfig(io.realm.mongodb.sync.SyncConfiguration p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}