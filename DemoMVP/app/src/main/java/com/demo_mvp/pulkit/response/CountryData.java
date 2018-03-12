package com.demo_mvp.pulkit.response;

import com.demo_mvp.pulkit.response.CountriesResponse;
import com.google.gson.annotations.SerializedName;

/**
 * Created by pulkit on 12/3/18.
 */

public class CountryData {

    @SerializedName("RestResponse")
    private CountriesResponse countriesResponse;

    public CountriesResponse getCountriesResponse() {
        return countriesResponse;
    }
}

