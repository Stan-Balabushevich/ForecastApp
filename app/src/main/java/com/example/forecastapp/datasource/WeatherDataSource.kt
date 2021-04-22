package com.example.forecastapp.datasource

import io.reactivex.Single

interface WeatherDataSource {
    fun getFiveDaysForecast(city: String, units: String, key: String): Single<WeatherInfoDataModel>
}