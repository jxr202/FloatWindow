package com.yhao.floatwindow;

/**
 * Created by yhao on 2018/5/5
 * Update by Jxr35 on 2018/08/12.
 * 添加了进入前台的标识
 */
public interface ViewStateListener {

    void onPositionUpdate(int x, int y);

    void onShow();

    void onHide();

    void onDismiss();

    void onMoveAnimStart();

    void onMoveAnimEnd();

    void onBackToDesktop();

    void onForeground();
}
