package cn.arunner.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by aRunner on 2018/3/26.
 */

public class LifeStyle {

    public String type;
    @SerializedName("txt")
    public String info;

//    @SerializedName("comf")
//    public Comfort comfort;
//    @SerializedName("cw")
//    public CarWash carWash;
//    public Sport sport;
//
//    public class Comfort {
//        @SerializedName("txt")
//        public String info;
//    }
//    public class CarWash {
//        @SerializedName("txt")
//        public String info;
//    }
//    public class Sport {
//        @SerializedName("txt")
//        public String info;
//    }
}
