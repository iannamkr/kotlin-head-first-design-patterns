package design.patterns.example.observer

import design.patterns.example.observer.display.CurrentConditionsDisplay
import design.patterns.example.observer.display.ForecastDisplay
import design.patterns.example.observer.display.StatisticsDisplay
import design.patterns.example.observer.display.ThirdPartyDisplay
import design.patterns.example.observer.display.WeatherData

fun main() {

    val weatherData = WeatherData()

    CurrentConditionsDisplay(weatherData)
    ForecastDisplay(weatherData)
    StatisticsDisplay(weatherData)
    ThirdPartyDisplay(weatherData)

    weatherData.setMeasurements(80.0f, 54.0f, 30.4f)
    weatherData.setMeasurements(82.0f, 70.0f, 29.2f)
    weatherData.setMeasurements(78.0f, 90.0f, 29.2f)
}
