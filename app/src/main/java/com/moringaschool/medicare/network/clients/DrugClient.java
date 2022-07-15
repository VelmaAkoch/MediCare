package com.moringaschool.medicare.network.clients;

import com.moringaschool.medicare.models.Constants;
import com.moringaschool.medicare.network.interfaces.DrugApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DrugClient {
    private static Retrofit retrofit = null;

    public static DrugApi getClient() {

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.DRUG_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(DrugApi.class);
    }
}
