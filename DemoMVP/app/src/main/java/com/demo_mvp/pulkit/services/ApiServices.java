package com.demo_mvp.pulkit.services;

import com.demo_mvp.pulkit.response.CountryData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiServices {

    @GET("country/get/all")
    Call<CountryData> getResults();

    @GET("country/get/iso2code/{alpha2_code}")
    Call<CountryData> getByAlpha2Code(@Path("alpha2_code") String alpha2Code);

}
