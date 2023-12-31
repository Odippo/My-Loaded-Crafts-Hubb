// Generated by view binder compiler. Do not edit!
package com.example.craftshub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.craftshub.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton button;

  @NonNull
  public final TextInputEditText mEmailEt;

  @NonNull
  public final TextInputLayout mEmailLayout;

  @NonNull
  public final TextInputEditText mIdET;

  @NonNull
  public final TextInputLayout mIdLayout;

  private ActivityRegisterBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton button, @NonNull TextInputEditText mEmailEt,
      @NonNull TextInputLayout mEmailLayout, @NonNull TextInputEditText mIdET,
      @NonNull TextInputLayout mIdLayout) {
    this.rootView = rootView;
    this.button = button;
    this.mEmailEt = mEmailEt;
    this.mEmailLayout = mEmailLayout;
    this.mIdET = mIdET;
    this.mIdLayout = mIdLayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      AppCompatButton button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.mEmailEt;
      TextInputEditText mEmailEt = ViewBindings.findChildViewById(rootView, id);
      if (mEmailEt == null) {
        break missingId;
      }

      id = R.id.mEmailLayout;
      TextInputLayout mEmailLayout = ViewBindings.findChildViewById(rootView, id);
      if (mEmailLayout == null) {
        break missingId;
      }

      id = R.id.mIdET;
      TextInputEditText mIdET = ViewBindings.findChildViewById(rootView, id);
      if (mIdET == null) {
        break missingId;
      }

      id = R.id.mIdLayout;
      TextInputLayout mIdLayout = ViewBindings.findChildViewById(rootView, id);
      if (mIdLayout == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((ConstraintLayout) rootView, button, mEmailEt,
          mEmailLayout, mIdET, mIdLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
