package com.zhang.mymvp;

import android.content.Context;

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
public class MyApplicationModule {
    private Context mContext;

    public MyApplicationModule(Context context) {
        mContext = context;
    }

    @Provides
    @PreApplication
    Context providesApplicationContext() {
        return mContext;
    }
}
