package com.zhang.mymvp.injector.components;

import com.zhang.mymvp.MyApplicationComponent;
import com.zhang.mymvp.injector.PreActivity;
import com.zhang.mymvp.injector.modules.MyAdapterModule;
import com.zhang.mymvp.view.ListActivity;

import dagger.Component;

/**
 * Project: MyMvp
 * Author:  张佳林
 * Version:  1.0
 * Date:    2017/6/28
 * Modify:  //TODO
 * Description: //TODO
 * Copyright notice:
 */
@PreActivity  //对应MyAdapterModule的注解
@Component(dependencies = MyApplicationComponent.class,modules = MyAdapterModule.class)
public interface MyAdapterComponent {
    void inject(ListActivity listActivity);
}
