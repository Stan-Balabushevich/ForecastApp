package com.example.forecastapp.domain

import com.example.forecastapp.domain.WeatherInfoDomainModel
import io.reactivex.Single

interface WeatherForecastUseCase {

    fun getFiveDaysForecast(city: String): Single<List<WeatherInfoDomainModel>>
}