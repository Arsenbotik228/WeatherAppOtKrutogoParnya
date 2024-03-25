package com.myself223.weatherappotkrutogoparnya.data.model

import com.google.gson.annotations.SerializedName

data class LocationDto(
    val name : String,
    val country:String,
    @SerializedName("tz_id")
    val zoneId : String,
    @SerializedName("localtime_epoch")
    val localEpoch : String
)
