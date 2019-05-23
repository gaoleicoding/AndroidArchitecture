package com.gaolei.mvpmodel.viewmodel;

import android.app.Application;

import com.gaolei.mvpmodel.mmodel.BannerListData;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BannerViewModel extends BaseViewModel {
    private static final String TAG = BannerViewModel.class.getName();


    private MutableLiveData<BannerListData> bannerLiveData;


    public BannerViewModel(Application application) {
        super(application);
        bannerLiveData = new MutableLiveData<>();
    }

    public LiveData<BannerListData> getObservableBanner() {
        return bannerLiveData;
    }

    public LiveData<BannerListData> getBanner() {

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

        return bannerLiveData;
    }

}
