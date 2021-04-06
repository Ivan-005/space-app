package com.space.spaceapp.retrofit.requests;

import com.space.spaceapp.models.Rss;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Requests {

    @GET("/")
    Call<Rss> getData();
}
