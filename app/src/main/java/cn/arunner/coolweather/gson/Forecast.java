package cn.arunner.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by aRunner on 2018/3/26.
 */

public class Forecast {

    public String date;
    @SerializedName("tmp_max")
    public String max;
    @SerializedName("tmp_min")
    public String min;
    @SerializedName("cond_txt_d")
    public String info;
//    @SerializedName("tmp")
//    public Temperature temperature;
//    @SerializedName("cond")
//    public More more;
//    public class Temperature {
//        public String max;
//        public String min;
//    }
//    public class More {
//        @SerializedName("txt_d")
//        public String info;
//    }
}
