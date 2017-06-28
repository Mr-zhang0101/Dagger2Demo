package com.zhang.mymvp.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zhang.mymvp.MyApplication;
import com.zhang.mymvp.R;
import com.zhang.mymvp.injector.components.DaggerMyAdapterComponent;
import com.zhang.mymvp.injector.modules.MyAdapterModule;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity implements IListView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ArrayList<String> data = new ArrayList<>();
        data.add("123");
        DaggerMyAdapterComponent.builder()
                .myApplicationComponent(MyApplication.sAppComponent)
                .myAdapterModule(new MyAdapterModule(R.layout.item,data))
                .build()
                .inject(this);
    }
}
