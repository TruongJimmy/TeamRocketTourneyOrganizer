package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001+B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010 \u001a\u00020!H\u0016J\u001c\u0010\"\u001a\u00020#2\n\u0010$\u001a\u00060\u0002R\u00020\u00002\u0006\u0010%\u001a\u00020!H\u0016J\u001c\u0010&\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020!H\u0016J\u0014\u0010*\u001a\u00020#2\n\u0010$\u001a\u00060\u0002R\u00020\u0000H\u0002R\u0019\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\n \b*\u0004\u0018\u00010\u00120\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R>\u0010\u0015\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00170\u0017 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00170\u0017\u0018\u00010\u00160\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006,"}, d2 = {"Lcom/mongodb/app/ActiveUpcomingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/mongodb/app/ActiveUpcomingAdapter$ViewHolder;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "config", "Lio/realm/mongodb/sync/SyncConfiguration;", "kotlin.jvm.PlatformType", "getConfig", "()Lio/realm/mongodb/sync/SyncConfiguration;", "images", "", "partition", "", "getPartition", "()Ljava/lang/String;", "realm", "Lio/realm/Realm;", "getRealm", "()Lio/realm/Realm;", "tourneyQuery", "Lio/realm/RealmResults;", "Lcom/mongodb/app/Tournament;", "getTourneyQuery", "()Lio/realm/RealmResults;", "setTourneyQuery", "(Lio/realm/RealmResults;)V", "user", "Lio/realm/mongodb/User;", "getUser", "()Lio/realm/mongodb/User;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onItemClicked", "ViewHolder", "app_debug"})
public final class ActiveUpcomingAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.mongodb.app.ActiveUpcomingAdapter.ViewHolder> {
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.Nullable()
    private final io.realm.mongodb.User user = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String partition = "123";
    private final io.realm.mongodb.sync.SyncConfiguration config = null;
    private final io.realm.Realm realm = null;
    private io.realm.RealmResults<com.mongodb.app.Tournament> tourneyQuery;
    private int[] images = {com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round, com.mongodb.app.R.mipmap.dbz_round};
    
    public ActiveUpcomingAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
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
    
    public final io.realm.RealmResults<com.mongodb.app.Tournament> getTourneyQuery() {
        return null;
    }
    
    public final void setTourneyQuery(io.realm.RealmResults<com.mongodb.app.Tournament> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.mongodb.app.ActiveUpcomingAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.mongodb.app.ActiveUpcomingAdapter.ViewHolder holder, int position) {
    }
    
    private final void onItemClicked(com.mongodb.app.ActiveUpcomingAdapter.ViewHolder holder) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\u001a\u0010\u001d\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\n\u00a8\u0006 "}, d2 = {"Lcom/mongodb/app/ActiveUpcomingAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/mongodb/app/ActiveUpcomingAdapter;Landroid/view/View;)V", "itemDetail", "Landroid/widget/TextView;", "getItemDetail", "()Landroid/widget/TextView;", "setItemDetail", "(Landroid/widget/TextView;)V", "itemGameName", "getItemGameName", "setItemGameName", "itemHost", "getItemHost", "setItemHost", "itemImage", "Landroid/widget/ImageView;", "getItemImage", "()Landroid/widget/ImageView;", "setItemImage", "(Landroid/widget/ImageView;)V", "itemPerson", "getItemPerson", "setItemPerson", "itemStartTime", "getItemStartTime", "setItemStartTime", "itemTitle", "getItemTitle", "setItemTitle", "app_debug"})
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
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView itemGameName;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView itemPerson;
        
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
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getItemGameName() {
            return null;
        }
        
        public final void setItemGameName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getItemPerson() {
            return null;
        }
        
        public final void setItemPerson(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
    }
}