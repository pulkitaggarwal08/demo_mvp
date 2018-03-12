package com.demo_mvp.pulkit.countries.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pulkit on 12/3/18.
 */

public class Country {

    @SerializedName("name")
    private String name;

    @SerializedName("alpha2_code")
    private String alphaCode2;

    @SerializedName("alpha3_code")
    private String alphaCode3;

    public String getName() {
        return name;
    }

    public String getAlphaCode2() {
        return alphaCode2;
    }

    public String getAlphaCode3() {
        return alphaCode3;
    }
}
