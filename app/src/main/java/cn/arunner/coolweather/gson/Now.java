package cn.arunner.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by aRunner on 2018/3/26.
 */

public class Now {

    @SerializedName("tmp")
    public String temperatrue;
    @SerializedName("cond_txt")
    public String info;
//    public More more;
//    public class More {
//        @SerializedName("txt")
//        public String info;
//    }
}
