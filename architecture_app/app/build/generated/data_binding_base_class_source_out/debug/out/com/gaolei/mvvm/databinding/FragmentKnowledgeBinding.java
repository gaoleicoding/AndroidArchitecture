// Generated by data binding compiler. Do not edit!
package com.gaolei.mvvm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.gaolei.mvvm.R;
import com.gaolei.mvvm.fragment.KnowledgeFragment;
import com.gaolei.mvvm.model.KnowledgeItem;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentKnowledgeBinding extends ViewDataBinding {
  @NonNull
  public final ImageView avatar;

  @NonNull
  public final TextView content;

  @Bindable
  protected KnowledgeFragment.EventListener mEventlistener;

  @Bindable
  protected KnowledgeItem mItem;

  protected FragmentKnowledgeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView avatar, TextView content) {
    super(_bindingComponent, _root, _localFieldCount);
    this.avatar = avatar;
    this.content = content;
  }

  public abstract void setEventlistener(@Nullable KnowledgeFragment.EventListener eventlistener);

  @Nullable
  public KnowledgeFragment.EventListener getEventlistener() {
    return mEventlistener;
  }

  public abstract void setItem(@Nullable KnowledgeItem item);

  @Nullable
  public KnowledgeItem getItem() {
    return mItem;
  }

  @NonNull
  public static FragmentKnowledgeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_knowledge, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentKnowledgeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentKnowledgeBinding>inflateInternal(inflater, R.layout.fragment_knowledge, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentKnowledgeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_knowledge, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentKnowledgeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentKnowledgeBinding>inflateInternal(inflater, R.layout.fragment_knowledge, null, false, component);
  }

  public static FragmentKnowledgeBinding bind(@NonNull View view) {
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
  public static FragmentKnowledgeBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentKnowledgeBinding)bind(component, view, R.layout.fragment_knowledge);
  }
}
