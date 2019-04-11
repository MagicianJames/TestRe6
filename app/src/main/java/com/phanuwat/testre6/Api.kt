package com.phanuwat.testre6

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
//    @GET("/search/users")
//    fun getUsers(@Query("q")q:String): Call<List<User>>
    @GET("db/getPlaceDetail")
    fun getPlaceDetail(@Query("t")t: String): Call<List<getPlaceDetail>>
}