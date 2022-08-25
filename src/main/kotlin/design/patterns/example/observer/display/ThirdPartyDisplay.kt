package design.patterns.example.observer.display

import design.patterns.example.observer.interfaces.DisplayElement
import design.patterns.example.observer.interfaces.Observer

class ThirdPartyDisplay constructor(private val weatherData: WeatherData): Observer, DisplayElement {

    private lateinit var weather: Weather

    init {
        weatherData.registryObserver(this)
    }

    override fun display() {
        println("[${this.javaClass.simpleName}] 현재 상태: 온도 ${weather.temperature}, 습도: ${weather.humidity}")
    }

    override fun update() {
        this.weather = weatherData.weather
        display()
    }
}