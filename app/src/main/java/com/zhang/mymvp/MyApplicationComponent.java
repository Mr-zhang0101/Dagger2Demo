package com.zhang.mymvp;

import android.content.Context;

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
@PreApplication
@Component(modules = MyApplicationModule.class)
public interface MyApplicationComponent {
    // 向对其依赖的Component提供Context对象
    Context proContext();
}
