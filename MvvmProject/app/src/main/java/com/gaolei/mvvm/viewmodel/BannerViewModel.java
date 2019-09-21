package com.gaolei.mvvm.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.gaolei.mvvm.mmodel.BannerListData;
import com.gaolei.mvvm.net.RestApiProvider;
import com.gaolei.mvvm.net.RestService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BannerViewModel extends AndroidViewModel {

    private MutableLiveData<BannerListData> bannerLiveData;
    private RestService gitHubService;

    public BannerViewModel(Application application) {
        super(application);
        bannerLiveData = new MutableLiveData<>();
        gitHubService = RestApiProvider.getInstance().builder().get();
    }

    public LiveData<BannerListData> getObservableBanner() {
        return bannerLiveData;
    }

    public void getBanners() {

        gitHubService.getBannerListData().enqueue(new Callback<BannerListData>() {
            @Override
            public void onResponse(Call<BannerListData> call, Response<BannerListData> response) {
                bannerLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<BannerListData> call, Throwable t) {
                bannerLiveData.setValue(null);
            }


        });
    }

}
