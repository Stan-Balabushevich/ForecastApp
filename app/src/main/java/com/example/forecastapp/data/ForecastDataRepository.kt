package com.example.forecastapp.data

import com.example.forecastapp.domain.WeatherInfoDomainModel
import io.reactivex.Single

interface ForecastDataRepository {
    fun getFiveDaysForecast(city: String, units: String, key: String): Single <List<WeatherInfoDomainModel>>
}