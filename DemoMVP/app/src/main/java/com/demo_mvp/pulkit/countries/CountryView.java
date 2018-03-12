package com.demo_mvp.pulkit.countries;

import com.demo_mvp.pulkit.countries.model.Country;

import java.util.List;

/**
 * Created by pulkit on 12/3/18.
 */

public interface CountryView {

    void countriesSuccess(List<Country> countries);
    void countriesError();
}
