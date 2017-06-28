package com.zhang.mymvp.injector.components;

import com.zhang.mymvp.injector.modules.PersonModule;
import com.zhang.mymvp.view.FirstActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Project: MyMvp
 * Author:  张佳林
 * Version:  1.0
 * Date:    2017/6/27
 * Modify:  //TODO
 * Description: //TODO
 * Copyright notice:
 */

@Singleton
@Component(modules = PersonModule.class)
public interface PersonComonent {
    void inject(FirstActivity firstActivity);
}
