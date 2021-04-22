package com.example.forecastapp.citieslist

import com.example.forecastapp.datasource.database.CityEntity

class EntityListToItemListMapper: (List<CityEntity>) -> List<CityItem> {
    override fun invoke(entityList: List<CityEntity>): List<CityItem> =
            entityList.map { item ->
                CityItem(
                        city = item.cityName
                )
            }
}