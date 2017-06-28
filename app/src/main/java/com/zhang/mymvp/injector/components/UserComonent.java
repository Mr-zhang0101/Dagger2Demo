package com.zhang.mymvp.injector.components;

import com.zhang.mymvp.injector.PreActivity;
import com.zhang.mymvp.injector.modules.UserModule;
import com.zhang.mymvp.view.SecondActivity;
import com.zhang.mymvp.view.ThirdActivity;

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
@PreActivity
@Component(modules = UserModule.class)
public interface UserComonent {
    void inject(SecondActivity secondActivity);
    void inject(ThirdActivity thirdActivity);

}
