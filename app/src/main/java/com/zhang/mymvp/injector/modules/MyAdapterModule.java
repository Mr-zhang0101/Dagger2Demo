package com.zhang.mymvp.injector.modules;

import android.content.Context;

import com.zhang.mymvp.adapter.MyAdapter;
import com.zhang.mymvp.injector.PreActivity;

import java.util.List;

import dagger.Module;
import dagger.Provides;

/**
 * Project: MyMvp
 * Author:  张佳林
 * Version:  1.0
 * Date:    2017/6/28
 * Modify:  //TODO
 * Description: //TODO
 * Copyright notice:
 */

@Module
public class MyAdapterModule {

    private int mLayoutId;
    private List<String> mData;

    public MyAdapterModule(int layoutId, List<String> data) {
        this.mLayoutId = layoutId;
        this.mData = data;
    }

    @Provides
    int provideLayoutId(){
        return mLayoutId;
    }

    @Provides
    List<String> provideList(){
        return mData;
    }

    @Provides
    @PreActivity // 注意：声明其所构造的对象单例
    MyAdapter provideMyAdapterContext( Context context, int layoutId, List<String> data){
        return new MyAdapter(context,layoutId,data);
    }
}
