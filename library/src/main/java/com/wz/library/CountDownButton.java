package com.wz.library;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by win7 on 2017/5/9.
 */

public class CountDownButton extends Button {

    private TimeCount mTimeCount;
    private long millisInFuture = 60000;
    private long countDownInterval = 1000;
    private String mTickText = "s后重新获取";
    private String mFinishText = "重新获取";

    public CountDownButton(Context context) {
        super(context);
        init(context);
    }

    public CountDownButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public CountDownButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {

    }

    /**
     * 设置倒计时多少毫秒结束
     * 默认60秒
     *
     * @param millisInFuture 毫秒
     */
    public void setMillisInFuture(long millisInFuture) {
        this.millisInFuture = millisInFuture;
    }

    /**
     * 设置倒计时间隔
     * 默认1秒
     *
     * @param countDownInterval 倒计时间隔
     */
    public void setCountDownInterval(long countDownInterval) {
        this.countDownInterval = countDownInterval;
    }

    /**
     * 设置倒计时过程中button显示内容
     * @param text 默认 s后重新获取
     */
    public void setOnTickText(String text) {
        this.mTickText=text;
    }

    /**
     * 设置倒计时结束button显示内容
     * @param finishText 默认 重新获取
     */
    public void setOnFinishText(String finishText){
        this.mFinishText=finishText;
    }



    public void startCount() {
        mTimeCount = new TimeCount(millisInFuture, countDownInterval, this, mTickText, mFinishText);
        mTimeCount.start();
    }

}
