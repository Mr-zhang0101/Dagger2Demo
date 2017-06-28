package com.zhang.mymvp.injector.modules;

import com.zhang.mymvp.view.INewsView;

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
public class NewsModule {
    private INewsView mView;

    public NewsModule(INewsView mView) {
        this.mView = mView;
    }

    @Provides
    INewsView providesINewsView(){
        // 提供IHomeView的实现类对象
        return mView;
    }
}
