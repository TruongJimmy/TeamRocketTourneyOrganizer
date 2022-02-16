// Generated by view binder compiler. Do not edit!
package com.mongodb.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mongodb.app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCreateTournamentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button createTournamentButtonButton;

  @NonNull
  public final TextView createTournamentLogo;

  @NonNull
  public final EditText locationInput;

  @NonNull
  public final EditText participantInput;

  @NonNull
  public final EditText startTimeInput;

  @NonNull
  public final Toolbar toolBarCreateTournamentActivity;

  @NonNull
  public final EditText tournamentGameInput;

  @NonNull
  public final EditText tournamentNameInput;

  @NonNull
  public final EditText tournamentType;

  private ActivityCreateTournamentBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button createTournamentButtonButton, @NonNull TextView createTournamentLogo,
      @NonNull EditText locationInput, @NonNull EditText participantInput,
      @NonNull EditText startTimeInput, @NonNull Toolbar toolBarCreateTournamentActivity,
      @NonNull EditText tournamentGameInput, @NonNull EditText tournamentNameInput,
      @NonNull EditText tournamentType) {
    this.rootView = rootView;
    this.createTournamentButtonButton = createTournamentButtonButton;
    this.createTournamentLogo = createTournamentLogo;
    this.locationInput = locationInput;
    this.participantInput = participantInput;
    this.startTimeInput = startTimeInput;
    this.toolBarCreateTournamentActivity = toolBarCreateTournamentActivity;
    this.tournamentGameInput = tournamentGameInput;
    this.tournamentNameInput = tournamentNameInput;
    this.tournamentType = tournamentType;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCreateTournamentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCreateTournamentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_create_tournament, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCreateTournamentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.createTournamentButton_Button;
      Button createTournamentButtonButton = rootView.findViewById(id);
      if (createTournamentButtonButton == null) {
        break missingId;
      }

      id = R.id.createTournamentLogo;
      TextView createTournamentLogo = rootView.findViewById(id);
      if (createTournamentLogo == null) {
        break missingId;
      }

      id = R.id.location_input;
      EditText locationInput = rootView.findViewById(id);
      if (locationInput == null) {
        break missingId;
      }

      id = R.id.participant_input;
      EditText participantInput = rootView.findViewById(id);
      if (participantInput == null) {
        break missingId;
      }

      id = R.id.startTime_input;
      EditText startTimeInput = rootView.findViewById(id);
      if (startTimeInput == null) {
        break missingId;
      }

      id = R.id.toolBar_createTournamentActivity;
      Toolbar toolBarCreateTournamentActivity = rootView.findViewById(id);
      if (toolBarCreateTournamentActivity == null) {
        break missingId;
      }

      id = R.id.tournamentGame_input;
      EditText tournamentGameInput = rootView.findViewById(id);
      if (tournamentGameInput == null) {
        break missingId;
      }

      id = R.id.tournamentName_input;
      EditText tournamentNameInput = rootView.findViewById(id);
      if (tournamentNameInput == null) {
        break missingId;
      }

      id = R.id.tournamentType;
      EditText tournamentType = rootView.findViewById(id);
      if (tournamentType == null) {
        break missingId;
      }

      return new ActivityCreateTournamentBinding((ConstraintLayout) rootView,
          createTournamentButtonButton, createTournamentLogo, locationInput, participantInput,
          startTimeInput, toolBarCreateTournamentActivity, tournamentGameInput, tournamentNameInput,
          tournamentType);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
