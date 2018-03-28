package cn.arunner.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by aRunner on 2018/3/26.
 */

public class Weather {
    public String status;
    public Basic basic;
//    public AQI aqi;
    public Now now;
    public Update update;
    @SerializedName("lifestyle")
    public List<LifeStyle> lifeStyleList;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
