package com.zhang.mymvp.injector.modules;

import com.zhang.mymvp.injector.PreActivity;
import com.zhang.mymvp.model.User;

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
public class UserModule {
    private String mUsername;
    private int mPassword;
    public UserModule(String username,int pasword) {
        this.mUsername = username;
        this.mPassword = pasword;
    }

    @Provides
    String provideUsername(){
        return mUsername;
    }
    @Provides
    int providePassword(){
        return mPassword;
    }

    @Provides
    @PreActivity
    User providesUser(String username,int pasword) {
        return new User(username,pasword);
    }

}
