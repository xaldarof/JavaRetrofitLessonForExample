package com.example.namozvaqti;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * @Author: Temur
 * @Date: 19/07/2022
 */

public interface ApiService {

    @GET("search/users?q=Game")
    Call<BaseResponse> getUsers();
}
