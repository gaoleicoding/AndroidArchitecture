package com.gaolei.mvvm.model;

import androidx.databinding.BaseObservable;

public class PageTitle extends BaseObservable {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
