package com.gaolei.mvvm.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gaolei.mvvm.R;
import com.gaolei.mvvm.databinding.FragmentBaseBinding;
import com.gaolei.mvvm.utils.NetworkUtil;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;


public abstract class BaseFragment extends Fragment implements View.OnClickListener {
    FragmentBaseBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_base, container, false);
        initBaseView(binding);
        addContentView(inflater, container);
        Bundle bundle = getActivity().getIntent().getExtras();
        if (bundle == null) {
            bundle = savedInstanceState;
        }
        initView();
        initData(bundle);
        return binding.getRoot();
    }

    public abstract void initView();

    public abstract void initData(Bundle bundle);



    private void initBaseView(FragmentBaseBinding binding) {
        if (!NetworkUtil.isNetworkAvailable(getActivity()))
            binding.baseErrorLayout.llBaseErrorContent.setVisibility(View.VISIBLE);
        binding.baseErrorLayout.btErrorRefresh.setOnClickListener(this);
        return;
    }

    /**
     * 设置子布局layout
     */
    public abstract View getContentLayout(LayoutInflater inflater, ViewGroup container);

    public abstract void reload();

    /**
     * 设置内容
     */
    public void addContentView(LayoutInflater inflater, ViewGroup container) {
        binding.baseFragmentContent.addView(getContentLayout(inflater, container));
    }

    /**
     * 显示加载进度条
     *
     * @param isShow
     */
    public void setLoading(boolean isShow) {
        binding.llLoading.setVisibility(isShow ? View.VISIBLE : View.GONE);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_error_refresh:
                if (NetworkUtil.isNetworkAvailable(getActivity()))
                    binding.baseErrorLayout.llBaseErrorContent.setVisibility(View.GONE);
                reload();
                break;
        }
    }

}
