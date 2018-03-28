package cn.arunner.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by aRunner on 2018/3/26.
 */

public class Basic {

    @SerializedName("location")
    public String cityName;
    @SerializedName("cid")
    public String weatherId;
//    public Update update;
//    public class Update {
//        @SerializedName("loc")
//        public String updateTime;
//    }
}
