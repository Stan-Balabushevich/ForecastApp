package com.example.forecastapp.citieslist

import com.example.forecastapp.citieslist.CityItem
import com.example.forecastapp.datasource.database.CityEntity

class CityItemToEntityMapper: (CityItem) -> CityEntity {
    override fun invoke(cityItem: CityItem): CityEntity =
            CityEntity(
                    id = 0,
                    cityName = cityItem.city
            )
    }
