package com.demo_mvp.pulkit.response;

import com.demo_mvp.pulkit.countries.model.Country;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CountriesResponse {

    @SerializedName("messages")
    private List<String> messages;

    @SerializedName("result")
    private List<Country> result;

    public List<Country> getResult() {
        return result;
    }

    public List<String> getMessages() {
        return messages;
    }

}