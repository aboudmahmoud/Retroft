package com.example.retroftit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterFace {
    @GET("posts")
    public Call<List<Post>> getPost(@Query("userId") String userId);

    @POST("posts")
    public Call<Post> setPost(@Body Post post);
}
