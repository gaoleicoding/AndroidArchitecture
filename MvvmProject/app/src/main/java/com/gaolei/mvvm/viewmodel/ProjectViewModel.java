package com.gaolei.mvvm.viewmodel;

import android.app.Application;

import com.gaolei.mvvm.mmodel.ProjectListData;
import com.gaolei.mvvm.net.RestApiProvider;
import com.gaolei.mvvm.net.RestService;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProjectViewModel extends AndroidViewModel {

    public RestService gitHubService = RestApiProvider.getInstance().builder().getApiService();
    private MutableLiveData<ProjectListData> projectLiveData;

    public ProjectViewModel(Application application) {
        super(application);

        projectLiveData = new MutableLiveData<>();


    }

    public void setProjectParams(int curPage, int cid) {

        gitHubService.getProjectListData(curPage, cid).enqueue(new Callback<ProjectListData>() {
            @Override
            public void onResponse(Call<ProjectListData> call, Response<ProjectListData> response) {
                projectLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<ProjectListData> call, Throwable t) {
                projectLiveData.setValue(null);
            }


        });
    }

    public LiveData<ProjectListData> getObservableProject() {
        return projectLiveData;
    }

    public static class ProjectParams {
        int page = 1, cid = 294;

        public ProjectParams(int page, int cid) {
            this.page = page;
            this.cid = cid;
        }
    }
}
