package com.zhang.mymvp.injector.components;

import com.zhang.mymvp.injector.PreActivity;
import com.zhang.mymvp.injector.modules.HomeModule;
import com.zhang.mymvp.view.HomeActivity;

import dagger.Component;

/**
 * Project: MyMvp
 * Author:  张佳林
 * Version:  1.0
 * Date:    2017/6/23
 * Modify:  //TODO
 * Description: //TODO
 * Copyright notice:
 */
@PreActivity
@Component(modules = HomeModule.class)
public interface HomeComponent {
    void inject(HomeActivity homeActivity);
}
