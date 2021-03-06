// Generated by view binder compiler. Do not edit!
package com.mongodb.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
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

public final class FragmentProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button following;

  @NonNull
  public final Toolbar toolBarProfileActivity;

  @NonNull
  public final ImageView userAvatarProfile;

  @NonNull
  public final TextView userLevel;

  @NonNull
  public final TextView userName;

  private FragmentProfileBinding(@NonNull ConstraintLayout rootView, @NonNull Button following,
      @NonNull Toolbar toolBarProfileActivity, @NonNull ImageView userAvatarProfile,
      @NonNull TextView userLevel, @NonNull TextView userName) {
    this.rootView = rootView;
    this.following = following;
    this.toolBarProfileActivity = toolBarProfileActivity;
    this.userAvatarProfile = userAvatarProfile;
    this.userLevel = userLevel;
    this.userName = userName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.following;
      Button following = rootView.findViewById(id);
      if (following == null) {
        break missingId;
      }

      id = R.id.toolBar_ProfileActivity;
      Toolbar toolBarProfileActivity = rootView.findViewById(id);
      if (toolBarProfileActivity == null) {
        break missingId;
      }

      id = R.id.user_avatar_profile;
      ImageView userAvatarProfile = rootView.findViewById(id);
      if (userAvatarProfile == null) {
        break missingId;
      }

      id = R.id.user_level;
      TextView userLevel = rootView.findViewById(id);
      if (userLevel == null) {
        break missingId;
      }

      id = R.id.user_name;
      TextView userName = rootView.findViewById(id);
      if (userName == null) {
        break missingId;
      }

      return new FragmentProfileBinding((ConstraintLayout) rootView, following,
          toolBarProfileActivity, userAvatarProfile, userLevel, userName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
