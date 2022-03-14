// Generated by view binder compiler. Do not edit!
package com.mongodb.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mongodb.app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SuggestionPageRowBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView tournamentName;

  @NonNull
  public final ImageView tournamentPic;

  private SuggestionPageRowBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView tournamentName, @NonNull ImageView tournamentPic) {
    this.rootView = rootView;
    this.tournamentName = tournamentName;
    this.tournamentPic = tournamentPic;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SuggestionPageRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SuggestionPageRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.suggestion_page_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SuggestionPageRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tournamentName;
      TextView tournamentName = rootView.findViewById(id);
      if (tournamentName == null) {
        break missingId;
      }

      id = R.id.tournamentPic;
      ImageView tournamentPic = rootView.findViewById(id);
      if (tournamentPic == null) {
        break missingId;
      }

      return new SuggestionPageRowBinding((ConstraintLayout) rootView, tournamentName,
          tournamentPic);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
