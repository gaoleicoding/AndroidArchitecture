package com.gaolei.mvvm;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.gaolei.mvvm.databinding.ActivityArticleDetailBindingImpl;
import com.gaolei.mvvm.databinding.ActivityMainBindingImpl;
import com.gaolei.mvvm.databinding.FragmentBaseBindingImpl;
import com.gaolei.mvvm.databinding.FragmentHomeBindingImpl;
import com.gaolei.mvvm.databinding.FragmentKnowledgeBindingImpl;
import com.gaolei.mvvm.databinding.FragmentNavigationBindingImpl;
import com.gaolei.mvvm.databinding.FragmentProjectBindingImpl;
import com.gaolei.mvvm.databinding.ItemProjectListBindingImpl;
import com.gaolei.mvvm.databinding.LayoutErrorPageBindingImpl;
import com.gaolei.mvvm.databinding.LayoutHeaderBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYARTICLEDETAIL = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_FRAGMENTBASE = 3;

  private static final int LAYOUT_FRAGMENTHOME = 4;

  private static final int LAYOUT_FRAGMENTKNOWLEDGE = 5;

  private static final int LAYOUT_FRAGMENTNAVIGATION = 6;

  private static final int LAYOUT_FRAGMENTPROJECT = 7;

  private static final int LAYOUT_ITEMPROJECTLIST = 8;

  private static final int LAYOUT_LAYOUTERRORPAGE = 9;

  private static final int LAYOUT_LAYOUTHEADER = 10;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(10);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gaolei.mvvm.R.layout.activity_article_detail, LAYOUT_ACTIVITYARTICLEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gaolei.mvvm.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gaolei.mvvm.R.layout.fragment_base, LAYOUT_FRAGMENTBASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gaolei.mvvm.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gaolei.mvvm.R.layout.fragment_knowledge, LAYOUT_FRAGMENTKNOWLEDGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gaolei.mvvm.R.layout.fragment_navigation, LAYOUT_FRAGMENTNAVIGATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gaolei.mvvm.R.layout.fragment_project, LAYOUT_FRAGMENTPROJECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gaolei.mvvm.R.layout.item_project_list, LAYOUT_ITEMPROJECTLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gaolei.mvvm.R.layout.layout_error_page, LAYOUT_LAYOUTERRORPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gaolei.mvvm.R.layout.layout_header, LAYOUT_LAYOUTHEADER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYARTICLEDETAIL: {
          if ("layout/activity_article_detail_0".equals(tag)) {
            return new ActivityArticleDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_article_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBASE: {
          if ("layout/fragment_base_0".equals(tag)) {
            return new FragmentBaseBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_base is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTKNOWLEDGE: {
          if ("layout/fragment_knowledge_0".equals(tag)) {
            return new FragmentKnowledgeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_knowledge is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNAVIGATION: {
          if ("layout/fragment_navigation_0".equals(tag)) {
            return new FragmentNavigationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_navigation is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROJECT: {
          if ("layout/fragment_project_0".equals(tag)) {
            return new FragmentProjectBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_project is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPROJECTLIST: {
          if ("layout/item_project_list_0".equals(tag)) {
            return new ItemProjectListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_project_list is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTERRORPAGE: {
          if ("layout/layout_error_page_0".equals(tag)) {
            return new LayoutErrorPageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_error_page is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTHEADER: {
          if ("layout/layout_header_0".equals(tag)) {
            return new LayoutHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_header is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(7);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "eventlistener");
      sKeys.put(2, "imgUrl");
      sKeys.put(3, "item");
      sKeys.put(4, "knowledgeContent");
      sKeys.put(5, "praiseCount");
      sKeys.put(6, "title");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(10);

    static {
      sKeys.put("layout/activity_article_detail_0", com.gaolei.mvvm.R.layout.activity_article_detail);
      sKeys.put("layout/activity_main_0", com.gaolei.mvvm.R.layout.activity_main);
      sKeys.put("layout/fragment_base_0", com.gaolei.mvvm.R.layout.fragment_base);
      sKeys.put("layout/fragment_home_0", com.gaolei.mvvm.R.layout.fragment_home);
      sKeys.put("layout/fragment_knowledge_0", com.gaolei.mvvm.R.layout.fragment_knowledge);
      sKeys.put("layout/fragment_navigation_0", com.gaolei.mvvm.R.layout.fragment_navigation);
      sKeys.put("layout/fragment_project_0", com.gaolei.mvvm.R.layout.fragment_project);
      sKeys.put("layout/item_project_list_0", com.gaolei.mvvm.R.layout.item_project_list);
      sKeys.put("layout/layout_error_page_0", com.gaolei.mvvm.R.layout.layout_error_page);
      sKeys.put("layout/layout_header_0", com.gaolei.mvvm.R.layout.layout_header);
    }
  }
}
