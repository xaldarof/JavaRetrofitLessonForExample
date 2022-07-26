package com.example.namozvaqti;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @Author: Temur
 * @Date: 19/07/2022
 */


public class ApiClient {

    public static String BASE_URL = "https://api.github.com/";

    static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    static ApiService service = retrofit.create(ApiService.class);

}
