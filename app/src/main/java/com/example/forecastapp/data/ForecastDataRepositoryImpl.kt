package com.example.forecastapp.data

import com.example.forecastapp.data.DaysDomainModelMapper
import com.example.forecastapp.data.ForecastDataRepository
import com.example.forecastapp.datasource.DayForecastModel
import com.example.forecastapp.datasource.WeatherDataSource
import com.example.forecastapp.datasource.WeatherInfoDataModel
import com.example.forecastapp.datasource.network.ApiController
import com.example.forecastapp.domain.WeatherInfoDomainModel
import io.reactivex.Single

class ForecastDataRepositoryImpl (
    private val weatherDataSource: WeatherDataSource = ApiController(),
    private val mapper: (List<DayForecastModel>, WeatherInfoDataModel) -> List<WeatherInfoDomainModel> = DaysDomainModelMapper()
        ): ForecastDataRepository {
    override fun getFiveDaysForecast(city: String, units: String, key: String): Single<List<WeatherInfoDomainModel>> =
        weatherDataSource.getFiveDaysForecast(city,units,key)
                .map { dataModel -> mapper(dataModel.list, dataModel) }
}