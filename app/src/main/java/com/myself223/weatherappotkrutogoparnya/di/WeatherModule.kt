package com.myself223.weatherappotkrutogoparnya.di

import com.myself223.weatherappotkrutogoparnya.BuildConfig.BASE_URL
import com.myself223.weatherappotkrutogoparnya.data.repository.responce.ApiSevise
import com.salievyt1353.weatherappv2.data.repository.WeatherRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object WeatherModule {
    @Provides
    @Singleton
    fun provideRetrofit() = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ApiSevise::class.java)

    @Provides
    fun provideWeatherRepository(apiSevise: ApiSevise) = WeatherRepository(apiSevise)
}