package com.example.retroftit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterFace {
    @GET("posts/2")
    public Call<Post> getPost();
}
