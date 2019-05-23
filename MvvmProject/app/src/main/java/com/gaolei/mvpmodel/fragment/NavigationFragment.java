package com.gaolei.mvpmodel.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gaolei.mvpmodel.R;
import com.gaolei.mvpmodel.databinding.FragmentNavigationBinding;

import androidx.databinding.DataBindingUtil;


public class NavigationFragment extends BaseFragment {

    FragmentNavigationBinding binding;

    @Override
    public void initView() {

    }

    @Override
    public void initData(Bundle bundle) {

    }

    @Override
    public View getContentLayout(LayoutInflater inflater, ViewGroup container) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_navigation, container, false);
        return binding.getRoot();
    }


    @Override
    public void reload() {
    }

}
