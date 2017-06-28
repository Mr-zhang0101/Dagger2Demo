package com.zhang.mymvp.presenter;

import com.zhang.mymvp.view.INewsView;

import javax.inject.Inject;

/**
 * Project: MyMvp
 * Author:  张佳林
 * Version:  1.0
 * Date:    2017/6/28
 * Modify:  //TODO
 * Description: //TODO
 * Copyright notice:
 */

public class NewsPresenter implements INewsPresenter{
    private INewsView mView;

    // @Inject 注解在构造方法上，用来提供实例
    @Inject
    public NewsPresenter(INewsView view) {
        this.mView = view;
    }
}
