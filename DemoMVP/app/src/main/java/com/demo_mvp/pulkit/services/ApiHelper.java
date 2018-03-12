package com.demo_mvp.pulkit.services;

import com.demo_mvp.pulkit.utils.AppConstant;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by pulkit on 12/3/18.
 */

public class ApiHelper {
    private Retrofit retrofit = null;

    public ApiServices getAPI() {
        if (retrofit == null) {
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(AppConstant.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit.create(ApiServices.class);
    }
}
