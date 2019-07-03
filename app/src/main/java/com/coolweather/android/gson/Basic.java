package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 描述：
 * 创建：Linkin
 * 日期：2019/7/2
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
