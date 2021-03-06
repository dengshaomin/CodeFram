package com.code.fastframe.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * Created by dengshaomin on 2017/12/19.
 */

public abstract class BaseItemLayout extends BaseViewLayout {


    public BaseItemLayout(Context context) {
        super(context);
    }

    public BaseItemLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseItemLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public void initView() {
        setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        initItemView();
    }

    public abstract void initItemView();

}
