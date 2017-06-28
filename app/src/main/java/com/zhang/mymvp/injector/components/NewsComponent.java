package com.zhang.mymvp.injector.components;

import com.zhang.mymvp.injector.modules.NewsModule;
import com.zhang.mymvp.view.NewsActivity;

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

@Component(modules = NewsModule.class)
public interface NewsComponent {
    void inject(NewsActivity newsActivity);
}
