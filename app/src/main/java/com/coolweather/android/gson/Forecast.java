package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 描述：
 * 创建：Linkin
 * 日期：2019/7/3
 */
public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
