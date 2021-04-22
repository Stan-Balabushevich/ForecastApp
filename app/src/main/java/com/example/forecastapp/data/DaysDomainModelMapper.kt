package com.example.forecastapp.data

import com.example.forecastapp.datasource.DayForecastModel
import com.example.forecastapp.datasource.WeatherInfoDataModel
import com.example.forecastapp.domain.WeatherInfoDomainModel


class DaysDomainModelMapper: (List<DayForecastModel>, WeatherInfoDataModel) -> List<WeatherInfoDomainModel> {

    override fun invoke(forcastModelList: List<DayForecastModel>, weatherInfoDataModel: WeatherInfoDataModel) =
             forcastModelList.map { item ->
                WeatherInfoDomainModel(
                        title = "${weatherInfoDataModel.city.name} , ${weatherInfoDataModel.city.country}",
                        iconId = "https://openweathermap.org/img/w/${item.weather[0].icon}.png",
                        temperature = item.main.temp_max.toInt(),
                        date = item.dt_txt,
                        description = item.weather[0].main
                )
            }
}