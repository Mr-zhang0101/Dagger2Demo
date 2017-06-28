package com.zhang.mymvp.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zhang.mymvp.R;
import com.zhang.mymvp.model.Person;

import javax.inject.Inject;

public class FirstActivity extends AppCompatActivity implements IFirstView{


    @Inject
    Person person1;

    @Inject
    Person person2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
      //  DaggerPersonComonent.builder().personModule(new PersonModule()).build().inject(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
