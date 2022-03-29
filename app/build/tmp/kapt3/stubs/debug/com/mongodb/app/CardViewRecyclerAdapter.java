package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\'\u001a\u00020(H\u0016J\u001c\u0010)\u001a\u00020*2\n\u0010+\u001a\u00060\u0002R\u00020\u00002\u0006\u0010,\u001a\u00020(H\u0016J\u001c\u0010-\u001a\u00060\u0002R\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020(H\u0016R\u0019\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR>\u0010\t\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u000b0\u000b \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\n0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR>\u0010\u0010\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u000b0\u000b \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\n0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0019\u001a\n \u0006*\u0004\u0018\u00010\u001a0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR>\u0010\u001d\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u000b0\u000b \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\n0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR>\u0010 \u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u000b0\u000b \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\n0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u000fR\u0013\u0010#\u001a\u0004\u0018\u00010$\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&\u00a8\u00062"}, d2 = {"Lcom/mongodb/app/CardViewRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/mongodb/app/CardViewRecyclerAdapter$ViewHolder;", "()V", "config", "Lio/realm/mongodb/sync/SyncConfiguration;", "kotlin.jvm.PlatformType", "getConfig", "()Lio/realm/mongodb/sync/SyncConfiguration;", "details", "Lio/realm/RealmResults;", "Lcom/mongodb/app/Tournament;", "getDetails", "()Lio/realm/RealmResults;", "setDetails", "(Lio/realm/RealmResults;)V", "host", "getHost", "setHost", "images", "", "partition", "", "getPartition", "()Ljava/lang/String;", "realm", "Lio/realm/Realm;", "getRealm", "()Lio/realm/Realm;", "startTime", "getStartTime", "setStartTime", "title", "getTitle", "setTitle", "user", "Lio/realm/mongodb/User;", "getUser", "()Lio/realm/mongodb/User;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class CardViewRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.mongodb.app.CardViewRecyclerAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private final io.realm.mongodb.User user = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String partition = "123";
    private final io.realm.mongodb.sync.SyncConfiguration config = null;
    private final io.realm.Realm realm = null;
    private io.realm.RealmResults<com.mongodb.app.Tournament> title;
    private io.realm.RealmResults<com.mongodb.app.Tournament> details;
    private io.realm.RealmResults<com.mongodb.app.Tournament> host;
    private io.realm.RealmResults<com.mongodb.app.Tournament> startTime;
    private int[] images = {com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round};
    
    public CardViewRecyclerAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.realm.mongodb.User getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPartition() {
        return null;
    }
    
    public final io.realm.mongodb.sync.SyncConfiguration getConfig() {
        return null;
    }
    
    public final io.realm.Realm getRealm() {
        return null;
    }
    
    public final io.realm.RealmResults<com.mongodb.app.Tournament> getTitle() {
        return null;
    }
    
    public final void setTitle(io.realm.RealmResults<com.mongodb.app.Tournament> p0) {
    }
    
    public final io.realm.RealmResults<com.mongodb.app.Tournament> getDetails() {
        return null;
    }
    
    public final void setDetails(io.realm.RealmResults<com.mongodb.app.Tournament> p0) {
    }
    
    public final io.realm.RealmResults<com.mongodb.app.Tournament> getHost() {
        return null;
    }
    
    public final void setHost(io.realm.RealmResults<com.mongodb.app.Tournament> p0) {
    }
    
    public final io.realm.RealmResults<com.mongodb.app.Tournament> getStartTime() {
        return null;
    }
    
    public final void setStartTime(io.realm.RealmResults<com.mongodb.app.Tournament> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.mongodb.app.CardViewRecyclerAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.mongodb.app.CardViewRecyclerAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/mongodb/app/CardViewRecyclerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/mongodb/app/CardViewRecyclerAdapter;Landroid/view/View;)V", "itemDetail", "Landroid/widget/TextView;", "getItemDetail", "()Landroid/widget/TextView;", "setItemDetail", "(Landroid/widget/TextView;)V", "itemHost", "getItemHost", "setItemHost", "itemImage", "Landroid/widget/ImageView;", "getItemImage", "()Landroid/widget/ImageView;", "setItemImage", "(Landroid/widget/ImageView;)V", "itemStartTime", "getItemStartTime", "setItemStartTime", "itemTitle", "getItemTitle", "setItemTitle", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView itemImage;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView itemTitle;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView itemDetail;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView itemHost;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView itemStartTime;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getItemImage() {
            return null;
        }
        
        public final void setItemImage(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getItemTitle() {
            return null;
        }
        
        public final void setItemTitle(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getItemDetail() {
            return null;
        }
        
        public final void setItemDetail(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getItemHost() {
            return null;
        }
        
        public final void setItemHost(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getItemStartTime() {
            return null;
        }
        
        public final void setItemStartTime(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
    }
}