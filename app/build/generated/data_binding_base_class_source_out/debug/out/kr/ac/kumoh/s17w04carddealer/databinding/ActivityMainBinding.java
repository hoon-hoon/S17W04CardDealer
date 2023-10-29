// Generated by view binder compiler. Do not edit!
package kr.ac.kumoh.s17w04carddealer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import kr.ac.kumoh.s17w04carddealer.R;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnShuffle;

  @NonNull
  public final ImageView card1;

  @NonNull
  public final ImageView card2;

  @NonNull
  public final ImageView card3;

  @NonNull
  public final ImageView card4;

  @NonNull
  public final ImageView card5;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnShuffle,
      @NonNull ImageView card1, @NonNull ImageView card2, @NonNull ImageView card3,
      @NonNull ImageView card4, @NonNull ImageView card5) {
    this.rootView = rootView;
    this.btnShuffle = btnShuffle;
    this.card1 = card1;
    this.card2 = card2;
    this.card3 = card3;
    this.card4 = card4;
    this.card5 = card5;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_shuffle;
      Button btnShuffle = ViewBindings.findChildViewById(rootView, id);
      if (btnShuffle == null) {
        break missingId;
      }

      id = R.id.card1;
      ImageView card1 = ViewBindings.findChildViewById(rootView, id);
      if (card1 == null) {
        break missingId;
      }

      id = R.id.card2;
      ImageView card2 = ViewBindings.findChildViewById(rootView, id);
      if (card2 == null) {
        break missingId;
      }

      id = R.id.card3;
      ImageView card3 = ViewBindings.findChildViewById(rootView, id);
      if (card3 == null) {
        break missingId;
      }

      id = R.id.card4;
      ImageView card4 = ViewBindings.findChildViewById(rootView, id);
      if (card4 == null) {
        break missingId;
      }

      id = R.id.card5;
      ImageView card5 = ViewBindings.findChildViewById(rootView, id);
      if (card5 == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, btnShuffle, card1, card2, card3,
          card4, card5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
