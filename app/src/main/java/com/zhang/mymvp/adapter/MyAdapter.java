package com.zhang.mymvp.adapter;

import android.content.Context;

import java.util.List;

/**
 * Project: MyMvp
 * Author:  张佳林
 * Version:  1.0
 * Date:    2017/6/28
 * Modify:  //TODO
 * Description: //TODO
 * Copyright notice:
 */

public class MyAdapter {

    private Context mContext;
    private int mLayoutId;
    private List<String> mData;

    public MyAdapter(Context context, int layoutId, List<String> data) {
        this.mContext = mContext;
        this.mLayoutId = mLayoutId;
        this.mData = mData;
    }
}
