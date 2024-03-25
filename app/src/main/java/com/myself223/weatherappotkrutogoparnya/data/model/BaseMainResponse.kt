package com.myself223.weatherappotkrutogoparnya.data.model

data class BaseMainResponse(
    val location: LocationDto,
    val current : CurrentDto,
    val forecast: ForecastDto
)
