package com.zhang.mymvp.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zhang.mymvp.R;
import com.zhang.mymvp.presenter.HomePresenter;

import javax.inject.Inject;

public class HomeActivity extends AppCompatActivity implements IHomeView {

    @Inject
    HomePresenter mHomePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
    }

    private void initView() {
       // DaggerHomeComponent.builder().homeModule(new HomeModule()).build().inject(this);

    }

    @Override
    public void showData() {

    }
}
