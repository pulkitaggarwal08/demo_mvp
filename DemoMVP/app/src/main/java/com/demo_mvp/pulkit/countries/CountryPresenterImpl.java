package com.demo_mvp.pulkit.countries;

import com.demo_mvp.pulkit.countries.model.Country;
import com.demo_mvp.pulkit.response.CountryData;
import com.demo_mvp.pulkit.services.ApiHelper;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by pulkit on 12/3/18.
 */

public class CountryPresenterImpl implements CountryPresenter {

    CountryView countryView;
    private ApiHelper apiHelper;

    public CountryPresenterImpl(CountryView countryView) {
        this.countryView = countryView;
        if (this.apiHelper == null) {
            this.apiHelper = new ApiHelper();
        }
    }

    @Override
    public void getCountries() {
        apiHelper.getAPI().getResults().enqueue(new Callback<CountryData>() {
            @Override
            public void onResponse(Call<CountryData> call, Response<CountryData> response) {
                CountryData countryData = response.body();
                if (countryData != null && countryData.getCountriesResponse() != null) {
                    List<Country> countriesList = countryData.getCountriesResponse().getResult();
                    countryView.countriesSuccess(countriesList);
                }
            }

            @Override
            public void onFailure(Call<CountryData> call, Throwable throwable) {
                try {
//                    throw new InterruptedException("Something went wrong!");
                    countryView.countriesError();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }

}
