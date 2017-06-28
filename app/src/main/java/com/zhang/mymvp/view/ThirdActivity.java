package com.zhang.mymvp.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zhang.mymvp.R;
import com.zhang.mymvp.model.User;

import javax.inject.Inject;

public class ThirdActivity extends AppCompatActivity implements IThirdView{

    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

    }
}
