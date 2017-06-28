package com.zhang.mymvp.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.zhang.mymvp.R;
import com.zhang.mymvp.model.User;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity implements ISecondView{


    @Inject
    User user;

    @Inject
    User user1;

    @Inject
    User user2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
      //  DaggerUserComonent.builder().userModule(new UserModule("123",456)).build().inject(this);
        Toast.makeText(this, user.getUsername()+"==="+user.getPassword(), Toast.LENGTH_SHORT).show();
    }
}
