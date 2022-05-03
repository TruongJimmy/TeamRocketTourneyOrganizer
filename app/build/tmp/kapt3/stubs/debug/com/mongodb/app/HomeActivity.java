package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\b\u0010 \u001a\u00020\u0015H\u0002J\b\u0010!\u001a\u00020\u0015H\u0002J\b\u0010\"\u001a\u00020\u0015H\u0002J\b\u0010#\u001a\u00020\u0015H\u0002J\b\u0010$\u001a\u00020\u0015H\u0002J\b\u0010%\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/mongodb/app/HomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "activeButton", "Landroid/widget/Button;", "brackets", "createTournamentButton", "gPay", "group", "message", "payButton", "profileButton", "rankingButton", "rateButton", "searchTournamentButton", "settingsButton", "suggestionButton", "tourneyPageButton", "userEmail", "Landroid/widget/TextView;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateTournamentButtonClicked", "onProfileButtonClicked", "onSearchTournamentButtonClicked", "onSettingsButtonClicked", "toActiveTourney", "toBracketActivity", "toChatRoom", "toGroupPage", "toMemberRank", "toMyRatingsPage", "toPaypalPage", "toSuggetionPage", "toTimerPage", "toTourneyPage", "app_debug"})
public final class HomeActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.widget.Button searchTournamentButton;
    private android.widget.Button createTournamentButton;
    private android.widget.Button settingsButton;
    private android.widget.Button profileButton;
    private android.widget.Button activeButton;
    private android.widget.Button suggestionButton;
    private android.widget.Button rankingButton;
    private android.widget.Button payButton;
    private android.widget.Button brackets;
    private android.widget.Button tourneyPageButton;
    private android.widget.Button group;
    private android.widget.Button message;
    private android.widget.TextView userEmail;
    private android.widget.Button rateButton;
    private android.widget.Button gPay;
    private java.util.HashMap _$_findViewCache;
    
    public HomeActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void toMyRatingsPage() {
    }
    
    private final void toChatRoom() {
    }
    
    private final void toGroupPage() {
    }
    
    private final void toTimerPage() {
    }
    
    private final void toTourneyPage() {
    }
    
    private final void toActiveTourney() {
    }
    
    private final void toPaypalPage() {
    }
    
    private final void toMemberRank() {
    }
    
    private final void toSuggetionPage() {
    }
    
    private final void onSearchTournamentButtonClicked() {
    }
    
    private final void onCreateTournamentButtonClicked() {
    }
    
    private final void toBracketActivity() {
    }
    
    private final void onSettingsButtonClicked() {
    }
    
    private final void onProfileButtonClicked() {
    }
}