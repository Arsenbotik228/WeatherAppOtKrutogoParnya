package com.myself223.weatherappotkrutogoparnya.data.repository.responce

import com.myself223.weatherappotkrutogoparnya.BuildConfig.API_KEY
import com.myself223.weatherappotkrutogoparnya.data.model.BaseMainResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiSevise {

    @GET("forecast.json")
    fun getWeather(
        @Query("key") apiKey :String = API_KEY,
        @Query("days") days: Int = 3,
        @Query("q") cityname :String = "Bishkek"
    ): Call<BaseMainResponse>
}