package com.example.myapicalltest3;

import com.example.myapicalltest3.Models.ImageResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JSONPlaceholder {
    @GET("photos")
    Call<List<ImageResponse>> getPhotos();
}
