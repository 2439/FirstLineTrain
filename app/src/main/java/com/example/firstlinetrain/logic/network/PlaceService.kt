package com.example.firstlinetrain.logic.network

import com.example.firstlinetrain.SunnyWeatherApplication
import com.example.firstlinetrain.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

//访问彩云天气城市搜索API
interface PlaceService {
    @GET("v2/place?token=${SunnyWeatherApplication.Token}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}