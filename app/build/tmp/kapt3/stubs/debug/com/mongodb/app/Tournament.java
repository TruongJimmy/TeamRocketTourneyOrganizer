package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0016\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010\u0013\u00a8\u0006*"}, d2 = {"Lcom/mongodb/app/Tournament;", "Lio/realm/RealmObject;", "id", "", "_partition", "name", "game", "participant", "", "location", "tournamentType", "date", "Ljava/util/Date;", "tournamentOrganizer", "Lcom/mongodb/app/User;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Date;Lcom/mongodb/app/User;)V", "get_partition", "()Ljava/lang/String;", "set_partition", "(Ljava/lang/String;)V", "getDate", "()Ljava/util/Date;", "setDate", "(Ljava/util/Date;)V", "getGame", "setGame", "getId", "setId", "getLocation", "setLocation", "getName", "setName", "getParticipant", "()I", "setParticipant", "(I)V", "getTournamentOrganizer", "()Lcom/mongodb/app/User;", "setTournamentOrganizer", "(Lcom/mongodb/app/User;)V", "getTournamentType", "setTournamentType", "app_debug"})
public class Tournament extends io.realm.RealmObject {
    @org.jetbrains.annotations.Nullable()
    @io.realm.annotations.RealmField(value = "_id")
    @io.realm.annotations.PrimaryKey()
    private java.lang.String id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String _partition;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String game;
    private int participant;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String location;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String tournamentType;
    @org.jetbrains.annotations.Nullable()
    private java.util.Date date;
    @org.jetbrains.annotations.Nullable()
    private com.mongodb.app.User tournamentOrganizer;
    
    public Tournament() {
        super();
    }
    
    public Tournament(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String _partition, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String game, int participant, @org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    java.lang.String tournamentType, @org.jetbrains.annotations.Nullable()
    java.util.Date date, @org.jetbrains.annotations.Nullable()
    com.mongodb.app.User tournamentOrganizer) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String get_partition() {
        return null;
    }
    
    public final void set_partition(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGame() {
        return null;
    }
    
    public final void setGame(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getParticipant() {
        return 0;
    }
    
    public final void setParticipant(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTournamentType() {
        return null;
    }
    
    public final void setTournamentType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.mongodb.app.User getTournamentOrganizer() {
        return null;
    }
    
    public final void setTournamentOrganizer(@org.jetbrains.annotations.Nullable()
    com.mongodb.app.User p0) {
    }
}