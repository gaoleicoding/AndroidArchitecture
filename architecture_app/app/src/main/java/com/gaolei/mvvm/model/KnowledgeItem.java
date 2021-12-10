package com.gaolei.mvvm.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.gaolei.mvvm.BR;

public class KnowledgeItem extends BaseObservable {
    private String imgUrl;
    private String knowledgeContent;
    private int praiseCount;

    @Bindable
    public String getKnowledgeContent() {
        return knowledgeContent == null ? "" : knowledgeContent;
    }

    @Bindable
    public int getPraiseCount() {
        return praiseCount;
    }

    @Bindable
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setPraiseCount(int praiseCount) {
        this.praiseCount = praiseCount;
        notifyPropertyChanged(BR.praiseCount);
    }

    public void setKnowledgeContent(String msg) {
        this.knowledgeContent = msg;
        //xml更新数据后，通知数据改变
        notifyPropertyChanged(BR.knowledgeContent);
    }

}
