package com.gaolei.mvvm.activity;

import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.gaolei.mvvm.R;
import com.gaolei.mvvm.databinding.ActivityArticleDetailBinding;

public class ArticleDetailActivity extends BaseActivity {

    ActivityArticleDetailBinding binding;

    @Override
    protected void initView() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_article_detail);
        binding.layoutHeader.title.setText(getString(R.string.article_detail));
        binding.layoutHeader.ivBack.setVisibility(View.VISIBLE);
    }

    @Override
    protected void initData(Bundle bundle) {

        String url = bundle.getString("url");
        binding.webviewArticle.loadUrl(url);
    }

}
