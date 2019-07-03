package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 描述：
 * 创建：Linkin
 * 日期：2019/7/3
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
