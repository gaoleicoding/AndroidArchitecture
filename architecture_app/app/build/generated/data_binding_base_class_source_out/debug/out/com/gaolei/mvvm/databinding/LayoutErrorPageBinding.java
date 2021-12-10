// Generated by data binding compiler. Do not edit!
package com.gaolei.mvvm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.gaolei.mvvm.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LayoutErrorPageBinding extends ViewDataBinding {
  @NonNull
  public final Button btErrorRefresh;

  @NonNull
  public final ImageView ivBaseHintPageIcon;

  @NonNull
  public final LinearLayout llBaseErrorContent;

  @NonNull
  public final TextView tvBaseHintPageContent;

  protected LayoutErrorPageBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btErrorRefresh, ImageView ivBaseHintPageIcon, LinearLayout llBaseErrorContent,
      TextView tvBaseHintPageContent) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btErrorRefresh = btErrorRefresh;
    this.ivBaseHintPageIcon = ivBaseHintPageIcon;
    this.llBaseErrorContent = llBaseErrorContent;
    this.tvBaseHintPageContent = tvBaseHintPageContent;
  }

  @NonNull
  public static LayoutErrorPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_error_page, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutErrorPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutErrorPageBinding>inflateInternal(inflater, R.layout.layout_error_page, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutErrorPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_error_page, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutErrorPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutErrorPageBinding>inflateInternal(inflater, R.layout.layout_error_page, null, false, component);
  }

  public static LayoutErrorPageBinding bind(@NonNull View view) {
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
  public static LayoutErrorPageBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutErrorPageBinding)bind(component, view, R.layout.layout_error_page);
  }
}
