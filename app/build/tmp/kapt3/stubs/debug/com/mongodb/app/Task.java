package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/mongodb/app/Task;", "Lio/realm/RealmObject;", "id", "Lorg/bson/types/ObjectId;", "isComplete", "", "summary", "", "(Lorg/bson/types/ObjectId;ZLjava/lang/String;)V", "getId", "()Lorg/bson/types/ObjectId;", "setId", "(Lorg/bson/types/ObjectId;)V", "()Z", "setComplete", "(Z)V", "getSummary", "()Ljava/lang/String;", "setSummary", "(Ljava/lang/String;)V", "app_debug"})
public class Task extends io.realm.RealmObject {
    @org.jetbrains.annotations.NotNull()
    @io.realm.annotations.PrimaryKey()
    @io.realm.annotations.RealmField(value = "_id")
    private org.bson.types.ObjectId id;
    private boolean isComplete;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String summary;
    
    public Task() {
        super();
    }
    
    public Task(@org.jetbrains.annotations.NotNull()
    org.bson.types.ObjectId id, boolean isComplete, @org.jetbrains.annotations.NotNull()
    java.lang.String summary) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bson.types.ObjectId getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    org.bson.types.ObjectId p0) {
    }
    
    public final boolean isComplete() {
        return false;
    }
    
    public final void setComplete(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSummary() {
        return null;
    }
    
    public final void setSummary(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}