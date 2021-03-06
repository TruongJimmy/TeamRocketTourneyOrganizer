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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mongodb.app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class QrcodeViewBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button generateQr;

  @NonNull
  public final TextView presentText;

  @NonNull
  public final ImageView qrCode;

  private QrcodeViewBinding(@NonNull ConstraintLayout rootView, @NonNull Button generateQr,
      @NonNull TextView presentText, @NonNull ImageView qrCode) {
    this.rootView = rootView;
    this.generateQr = generateQr;
    this.presentText = presentText;
    this.qrCode = qrCode;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static QrcodeViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static QrcodeViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.qrcode_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static QrcodeViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.generate_qr;
      Button generateQr = rootView.findViewById(id);
      if (generateQr == null) {
        break missingId;
      }

      id = R.id.presentText;
      TextView presentText = rootView.findViewById(id);
      if (presentText == null) {
        break missingId;
      }

      id = R.id.qr_code;
      ImageView qrCode = rootView.findViewById(id);
      if (qrCode == null) {
        break missingId;
      }

      return new QrcodeViewBinding((ConstraintLayout) rootView, generateQr, presentText, qrCode);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
