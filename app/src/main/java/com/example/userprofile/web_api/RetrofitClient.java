package com.example.userprofile.web_api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    public static Retrofit getRetrofit(){
        return new Retrofit.Builder()
                .baseUrl("http://syntecinternapi.azurewebsites.net/")
                .addConverterFactory( GsonConverterFactory.create())
                .build();



    }
}
