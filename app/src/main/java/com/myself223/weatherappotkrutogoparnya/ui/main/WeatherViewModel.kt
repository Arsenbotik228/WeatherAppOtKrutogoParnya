package com.myself223.weatherappotkrutogoparnya.ui.main

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.myself223.weatherappotkrutogoparnya.data.model.BaseMainResponse
import com.salievyt1353.weatherappv2.data.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val repository: WeatherRepository
): ViewModel() {
    var liveData =MediatorLiveData<BaseMainResponse>()
    fun getcurrentWeather() {
        liveData = repository.getWeather()
    }
}