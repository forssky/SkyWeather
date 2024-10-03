package com.fiqsky.skyweather

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
author Fiqih
Copyright 2023, FiqSky Project
 **/
object RetrofitClient {
    private const val BASE_URL = "https://api.openweathermap.org/data/2.5/"

    val instance: WeatherService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(WeatherService::class.java)
    }
}