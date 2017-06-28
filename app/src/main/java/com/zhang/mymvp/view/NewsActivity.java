package com.zhang.mymvp.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zhang.mymvp.R;
import com.zhang.mymvp.presenter.NewsPresenter;

import javax.inject.Inject;

public class NewsActivity extends AppCompatActivity implements INewsView{

    @Inject
    NewsPresenter newsPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
       // DaggerNewsComponent.builder().newsModule(new NewsModule(this)).build().inject(this);
    }
}
