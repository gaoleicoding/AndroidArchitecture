package com.gaolei.mvvm.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;

import com.gaolei.mvvm.R;
import com.gaolei.mvvm.databinding.FragmentKnowledgeBinding;
import com.gaolei.mvvm.model.KnowledgeItem;

public class KnowledgeFragment extends BaseFragment {

    private FragmentKnowledgeBinding binding;
    private KnowledgeItem itemData;

    @Override
    public void initView() {

    }

    @Override
    public void initData(Bundle bundle) {
        String url = "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fattach.bbs.miui.com%2Fforum%2F201012%2F29%2F195159pbdabbkqyjjyk3by.gif&refer=http%3A%2F%2Fattach.bbs.miui.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1613715988&t=203d649f3dea815dfc197cc65fe518ea";
        itemData = new KnowledgeItem();
        itemData.setKnowledgeContent(getString(R.string.android_desc));
        itemData.setImgUrl(url);
        binding.setItem(itemData);
    }

    @Override
    public View getContentLayout(LayoutInflater inflater, ViewGroup container) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_knowledge, container, false);
        binding.setEventlistener(new EventListener());
        return binding.getRoot();
    }


    @Override
    public void reload() {
    }

    public class EventListener {
        public void clickPraise(View view) {
            itemData.setPraiseCount(itemData.getPraiseCount() + 1);
            binding.setItem(itemData);
        }

    }
}
