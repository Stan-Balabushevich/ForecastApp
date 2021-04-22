package com.example.forecastapp.citieslist

import com.example.forecastapp.domain.WeatherInfoDomainModel


class CityItemMapper: (List<WeatherInfoDomainModel>) -> CityItem {
    override fun invoke(weatherInfoList: List<WeatherInfoDomainModel>): CityItem {
        var title: String? = null
        for (index in weatherInfoList.indices){
            title = weatherInfoList.get(index).title
        }
        return CityItem(
                city = title
        )
    }

}