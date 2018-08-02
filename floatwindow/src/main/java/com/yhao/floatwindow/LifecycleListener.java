package com.yhao.floatwindow;

/**
 * Created by yhao on 2017/12/22.
 * Update by Jxr35 on 2018/08/12.
 */

interface LifecycleListener {

    void onShow();

    void onHide();

    void onBackToDesktop();

    void onForeground();    //add to Foreground method
}
