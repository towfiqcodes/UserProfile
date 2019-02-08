package com.example.userprofile.web_api;

import com.example.userprofile.models.retrive_data.ProfileData;
import com.example.userprofile.models.userProfileResponse.Data;
import com.example.userprofile.models.userProfileResponse.UserResponse;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface RegistrationEasyApi {
    @Headers("Content-Type: application/json")
    @POST("api/User/CreateNewUser")
    Call<UserResponse>getResponse( @Body HashMap<String, Data> dataHashMap);

    @GET("api/user/getusers")
    Call<ProfileData>getData();
}
