package com.moekyawaung.kmp.domain

data class Weather(
    val city: String,
    val temperature: Double,
    val condition: String,
    val humidity: Int
)

interface WeatherUseCase {
    suspend fun getCurrentWeather(city: String): Weather

}
