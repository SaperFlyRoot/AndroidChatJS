package com.example.aymen.androidchat;

import com.example.aymen.androidchat.ServerRequest;
import com.example.aymen.androidchat.ServerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestInterface {

    @POST("learn2crack-login-register/")
    Call<ServerResponse> operation(@Body ServerRequest request);

}