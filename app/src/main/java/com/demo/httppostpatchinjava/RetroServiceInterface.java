package com.demo.httppostpatchinjava;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface RetroServiceInterface {

    @POST("users")
    @Headers({"Accept:application/json", "Content-Type:application/json",
            "Authorization: Bearer 73668350bdf06c66f3388408c1a712b378c3e25da599753b21b664a6261e246c"})
    Call<UserResponse> createUser(@Body User params);
}
