// Generated by data binding compiler. Do not edit!
package com.gaolei.mvvm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.gaolei.mvvm.R;
import com.gaolei.mvvm.view.Html5Webview;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityArticleDetailBinding extends ViewDataBinding {
  @NonNull
  public final LayoutHeaderBinding layoutHeader;

  @NonNull
  public final Html5Webview webviewArticle;

  protected ActivityArticleDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LayoutHeaderBinding layoutHeader, Html5Webview webviewArticle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.layoutHeader = layoutHeader;
    this.webviewArticle = webviewArticle;
  }

  @NonNull
  public static ActivityArticleDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_article_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityArticleDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityArticleDetailBinding>inflateInternal(inflater, R.layout.activity_article_detail, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityArticleDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_article_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityArticleDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityArticleDetailBinding>inflateInternal(inflater, R.layout.activity_article_detail, null, false, component);
  }

  public static ActivityArticleDetailBinding bind(@NonNull View view) {
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
  public static ActivityArticleDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityArticleDetailBinding)bind(component, view, R.layout.activity_article_detail);
  }
}
