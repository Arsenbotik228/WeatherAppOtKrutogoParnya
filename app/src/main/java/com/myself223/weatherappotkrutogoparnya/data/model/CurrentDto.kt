package com.myself223.weatherappotkrutogoparnya.data.model

import com.google.gson.annotations.SerializedName

data class CurrentDto (
    @SerializedName("temp_c")
    val tempC:String,
    val  condition : ConditionDto,
    val humidity : Int,
    @SerializedName("pressure_mb")
    val pressureMb : Double,
    @SerializedName("wind_degree")
    val windDegree : Double,
    @SerializedName("wind_kph")
    val windKph : Double,

    )
