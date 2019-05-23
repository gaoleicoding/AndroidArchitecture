package com.gaolei.mvpmodel.viewmodel;

import android.app.Application;

import com.gaolei.mvpmodel.mmodel.ProjectListData;
import com.gaolei.mvpmodel.net.RestApiProvider;
import com.gaolei.mvpmodel.net.RestService;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BaseViewModel extends AndroidViewModel {


    public RestService gitHubService = RestApiProvider.getInstance().builder().getApiService();

    public BaseViewModel(Application application) {
        super(application);

    }

}
