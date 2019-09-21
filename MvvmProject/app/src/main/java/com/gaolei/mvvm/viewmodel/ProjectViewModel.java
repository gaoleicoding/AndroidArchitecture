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

    private RestService gitHubService;
    private MutableLiveData<ProjectListData> projectLiveData;

    public ProjectViewModel(Application application) {
        super(application);

        projectLiveData = new MutableLiveData<>();
        gitHubService = RestApiProvider.getInstance().builder().getApiService();
    }

    public void getProjects(int curPage, int cid) {

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

}
