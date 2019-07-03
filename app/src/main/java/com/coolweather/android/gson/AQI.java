package com.coolweather.android.gson;

/**
 * 描述：
 * 创建：Linkin
 * 日期：2019/7/3
 */
public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;

        public String pm25;
    }
}
