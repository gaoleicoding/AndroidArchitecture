package com.gaolei.mvvm.viewmodel;

import android.app.Application;

import com.gaolei.mvvm.net.RestApiProvider;
import com.gaolei.mvvm.net.RestService;

import androidx.lifecycle.AndroidViewModel;

public class BaseViewModel extends AndroidViewModel {


    public RestService gitHubService = RestApiProvider.getInstance().builder().getApiService();

    public BaseViewModel(Application application) {
        super(application);

    }

}
