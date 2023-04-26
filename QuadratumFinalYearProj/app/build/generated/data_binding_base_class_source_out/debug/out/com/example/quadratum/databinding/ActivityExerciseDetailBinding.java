// Generated by view binder compiler. Do not edit!
package com.example.quadratum.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.quadratum.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityExerciseDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView arrowView;

  @NonNull
  public final CalendarView calendarView;

  @NonNull
  public final CalendarView calendarView2;

  @NonNull
  public final TextView descriptionView;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final TextView nameView;

  @NonNull
  public final NestedScrollView nestedScrollView;

  @NonNull
  public final TextView setView;

  @NonNull
  public final View view;

  @NonNull
  public final View view2;

  private ActivityExerciseDetailBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView arrowView, @NonNull CalendarView calendarView,
      @NonNull CalendarView calendarView2, @NonNull TextView descriptionView,
      @NonNull ImageView imageView, @NonNull ImageView imageView3, @NonNull TextView nameView,
      @NonNull NestedScrollView nestedScrollView, @NonNull TextView setView, @NonNull View view,
      @NonNull View view2) {
    this.rootView = rootView;
    this.arrowView = arrowView;
    this.calendarView = calendarView;
    this.calendarView2 = calendarView2;
    this.descriptionView = descriptionView;
    this.imageView = imageView;
    this.imageView3 = imageView3;
    this.nameView = nameView;
    this.nestedScrollView = nestedScrollView;
    this.setView = setView;
    this.view = view;
    this.view2 = view2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityExerciseDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityExerciseDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_exercise_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityExerciseDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.arrowView;
      ImageView arrowView = ViewBindings.findChildViewById(rootView, id);
      if (arrowView == null) {
        break missingId;
      }

      id = R.id.calendarView;
      CalendarView calendarView = ViewBindings.findChildViewById(rootView, id);
      if (calendarView == null) {
        break missingId;
      }

      id = R.id.calendarView2;
      CalendarView calendarView2 = ViewBindings.findChildViewById(rootView, id);
      if (calendarView2 == null) {
        break missingId;
      }

      id = R.id.descriptionView;
      TextView descriptionView = ViewBindings.findChildViewById(rootView, id);
      if (descriptionView == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.nameView;
      TextView nameView = ViewBindings.findChildViewById(rootView, id);
      if (nameView == null) {
        break missingId;
      }

      id = R.id.nestedScrollView;
      NestedScrollView nestedScrollView = ViewBindings.findChildViewById(rootView, id);
      if (nestedScrollView == null) {
        break missingId;
      }

      id = R.id.setView;
      TextView setView = ViewBindings.findChildViewById(rootView, id);
      if (setView == null) {
        break missingId;
      }

      id = R.id.view;
      View view = ViewBindings.findChildViewById(rootView, id);
      if (view == null) {
        break missingId;
      }

      id = R.id.view2;
      View view2 = ViewBindings.findChildViewById(rootView, id);
      if (view2 == null) {
        break missingId;
      }

      return new ActivityExerciseDetailBinding((ConstraintLayout) rootView, arrowView, calendarView,
          calendarView2, descriptionView, imageView, imageView3, nameView, nestedScrollView,
          setView, view, view2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}