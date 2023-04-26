// Generated by view binder compiler. Do not edit!
package com.example.quadratum.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.quadratum.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class VerticalHorizontalListItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final TextView exerciseDescription;

  @NonNull
  public final ImageView exerciseImage;

  @NonNull
  public final TextView exerciseName;

  @NonNull
  public final TextView exerciseSets;

  private VerticalHorizontalListItemBinding(@NonNull MaterialCardView rootView,
      @NonNull TextView exerciseDescription, @NonNull ImageView exerciseImage,
      @NonNull TextView exerciseName, @NonNull TextView exerciseSets) {
    this.rootView = rootView;
    this.exerciseDescription = exerciseDescription;
    this.exerciseImage = exerciseImage;
    this.exerciseName = exerciseName;
    this.exerciseSets = exerciseSets;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static VerticalHorizontalListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static VerticalHorizontalListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.vertical_horizontal_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static VerticalHorizontalListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.exercise_description;
      TextView exerciseDescription = ViewBindings.findChildViewById(rootView, id);
      if (exerciseDescription == null) {
        break missingId;
      }

      id = R.id.exercise_image;
      ImageView exerciseImage = ViewBindings.findChildViewById(rootView, id);
      if (exerciseImage == null) {
        break missingId;
      }

      id = R.id.exercise_name;
      TextView exerciseName = ViewBindings.findChildViewById(rootView, id);
      if (exerciseName == null) {
        break missingId;
      }

      id = R.id.exercise_sets;
      TextView exerciseSets = ViewBindings.findChildViewById(rootView, id);
      if (exerciseSets == null) {
        break missingId;
      }

      return new VerticalHorizontalListItemBinding((MaterialCardView) rootView, exerciseDescription,
          exerciseImage, exerciseName, exerciseSets);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}