package com.gaolei.mvvm.viewmodel;

import android.app.Application;

import com.gaolei.mvvm.mmodel.ProjectListData;
import com.gaolei.mvvm.net.RestApiProvider;
import com.gaolei.mvvm.net.RestService;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProjectViewModel extends BaseViewModel {

    private MutableLiveData<ProjectListData> projectLiveData;
    private MutableLiveData<ProjectParams> paramsLiveData;


    private RestService gitHubService = RestApiProvider.getInstance().builder().getApiService();


    public ProjectViewModel(Application application) {
        super(application);

        paramsLiveData = new MutableLiveData<>();
        projectLiveData = new MutableLiveData<>();

//        projectObservable = Transformations.switchMap(paramsLiveData, input -> {
//            ProjectParams params=paramsLiveData.getValue();
//        return projectObservable = new ProjectRepository().getProjectInfo(params.page, params.cid);
//        });

    }

    public void setProjectParams(ProjectParams params) {

        gitHubService.getProjectListData(params.page, params.cid).enqueue(new Callback<ProjectListData>() {
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
