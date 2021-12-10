// Generated by data binding compiler. Do not edit!
package com.gaolei.mvvm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.gaolei.mvvm.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentBaseBinding extends ViewDataBinding {
  @NonNull
  public final LayoutErrorPageBinding baseErrorLayout;

  @NonNull
  public final FrameLayout baseFragmentContent;

  @NonNull
  public final RelativeLayout llLoading;

  protected FragmentBaseBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LayoutErrorPageBinding baseErrorLayout, FrameLayout baseFragmentContent,
      RelativeLayout llLoading) {
    super(_bindingComponent, _root, _localFieldCount);
    this.baseErrorLayout = baseErrorLayout;
    this.baseFragmentContent = baseFragmentContent;
    this.llLoading = llLoading;
  }

  @NonNull
  public static FragmentBaseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_base, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBaseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentBaseBinding>inflateInternal(inflater, R.layout.fragment_base, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentBaseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_base, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBaseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentBaseBinding>inflateInternal(inflater, R.layout.fragment_base, null, false, component);
  }

  public static FragmentBaseBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentBaseBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentBaseBinding)bind(component, view, R.layout.fragment_base);
  }
}
