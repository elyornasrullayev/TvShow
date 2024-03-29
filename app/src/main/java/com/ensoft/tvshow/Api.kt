package com.ensoft.tvshow

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "809af13a0ef685087e5a0098fcf3aab1",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = "809af13a0ef685087e5a0098fcf3aab1",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String = "809af13a0ef685087e5a0098fcf3aab1",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}