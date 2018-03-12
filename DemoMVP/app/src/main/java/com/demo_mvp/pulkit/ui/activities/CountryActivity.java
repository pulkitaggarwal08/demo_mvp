package com.demo_mvp.pulkit.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.demo_mvp.pulkit.R;
import com.demo_mvp.pulkit.countries.CountryPresenter;
import com.demo_mvp.pulkit.countries.CountryPresenterImpl;
import com.demo_mvp.pulkit.countries.CountryView;
import com.demo_mvp.pulkit.countries.model.Country;

import java.util.List;

public class CountryActivity extends AppCompatActivity implements CountryView {

    CountryPresenter countryPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        init();
    }

    private void init() {
        countryPresenter = new CountryPresenterImpl(this);
    }

    @Override
    public void countriesSuccess(List<Country> countries) {
        for (Country country : countries) {
            //Todo: Add data in adapter
            Log.i("RETROFIT", country.getName() + "\n"
                    + " - Alpha2:  " + country.getAlphaCode2() + " \n"
                    + " - Alpha3: " + country.getAlphaCode3());
        }
    }

    @Override
    public void countriesError() {
        Toast.makeText(this, "Countries not Found", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        countryPresenter.getCountries();
    }

}
