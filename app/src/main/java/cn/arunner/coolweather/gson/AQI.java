package cn.arunner.coolweather.gson;

/**
 * Created by aRunner on 2018/3/26.
 */

public class AQI {

    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
