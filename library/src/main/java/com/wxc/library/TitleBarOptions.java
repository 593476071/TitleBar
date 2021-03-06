package com.wxc.library;

import android.support.annotation.DrawableRes;

/**
 * Created by 王新超 on 2018/6/19.
 *
 * TitleBar Application 默认配置
 */
public class TitleBarOptions {
    private static TitleBarOptions options;
    /**
     * 左边图片
     */
    public int leftImg = R.drawable.back;
    /**
     * 背景颜色
     */
    public int backgroundColor=0xff3F51B5;
    /**
     * 标题文字大小
     */
    public int titleTextSize=34;
    /**
     * 标题字体颜色
     */
    public int titleTextColor=0xffffffff;
    /**
     * 状态栏颜色
     */
    public int statusColor = 0x00000000;

    /**
     * 两边字体大小
     */
    public int titleSidesTextSize= 26;

    /**
     * 是否是沉浸式
     */
    public boolean isImmersion;
    /**
     * 背景图片
     */
    public int backgroundDrawable = -1;
    /**
     * 出去状态栏以后的布局高度
     * 单位  dp
     */
    public int titleBarHeight = 35;

    public static TitleBarOptions getInstance() {
        if (options == null) {
            synchronized (TitleBarOptions.class) {
                if (options == null) {
                    options = new TitleBarOptions();
                }
            }
        }
        return options;
    }

    public TitleBarOptions setLeftImg(@DrawableRes int leftImg) {
        this.leftImg = leftImg;
        return this;
    }

    public TitleBarOptions setBackground(int backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    /**
     * @param titleTextSize sp
     */
    public TitleBarOptions setTitleTextSize(int titleTextSize) {
        this.titleTextSize = titleTextSize;
        return this;
    }

    public TitleBarOptions setTitleTextColor(int titleTextColor) {
        this.titleTextColor = titleTextColor;
        return this;
    }

    public TitleBarOptions setStatusColor(int statusColor){
        this.statusColor = statusColor;
        return this;
    }
    /**
     * @param titleSidesTextSize sp
     */
    public TitleBarOptions setTitleSidesTextSize(int titleSidesTextSize){
        this.titleSidesTextSize = titleSidesTextSize;
        return this;
    }
    public TitleBarOptions immersion(boolean isImmersion){
        this.isImmersion = isImmersion;
        return this;
    }
    public TitleBarOptions setBackgroundDrawable(int backgroundDrawable){
        this.backgroundDrawable = backgroundDrawable;
        return this;
    }
    public TitleBarOptions setTitleBarHeight(int height){
        this.titleBarHeight = height;
        return this;
    }
}
