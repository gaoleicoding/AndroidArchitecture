package com.gaolei.mvvm.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gaolei.mvvm.R;
import com.gaolei.mvvm.databinding.FragmentKnowledgeBinding;

import androidx.databinding.DataBindingUtil;

public class KnowledgeFragment extends BaseFragment {

    private FragmentKnowledgeBinding binding;

    @Override
    public void initView() {

    }

    @Override
    public void initData(Bundle bundle) {

    }


    @Override
    public View getContentLayout(LayoutInflater inflater, ViewGroup container) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_knowledge, container, false);
        return binding.getRoot();
    }


    @Override
    public void reload() {
    }


}
