package design.patterns.example.observer.display

import design.patterns.example.observer.interfaces.DisplayElement
import design.patterns.example.observer.interfaces.Observer

class CurrentConditionsDisplay constructor(private val weatherData: WeatherData): Observer, DisplayElement {

    private var temperature: Float = 0.0f
    private var humidity: Float = 0.0f

    init {
        weatherData.registryObserver(this)
    }

    override fun display() {
        println("[${this.javaClass.simpleName}] 현재 상태: 온도 ${temperature}, 습도: ${humidity}")
    }

    override fun update() {
        val weather = weatherData.weather

        temperature = weather.temperature
        humidity = weather.humidity

        display()
    }
}