package com.example.glimpse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    String BASE_URl = "https://newsapi.org/v2/";


    @GET("top-headlines")
    Call<com.example.glimpse.mainNews> getNews(

            @Query("country") String country,
            @Query("pageSize") int pagesize,
            @Query("apiKey") String apikey
    );


    @GET("top-headlines")
    Call<com.example.glimpse.mainNews> getCategoryNews(

            @Query("country") String country,
            @Query("category") String category,
            @Query("pageSize") int pagesize,
            @Query("apiKey") String apikey
    );

}
