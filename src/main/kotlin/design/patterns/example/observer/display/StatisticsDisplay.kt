package design.patterns.example.observer.display

import design.patterns.example.observer.interfaces.DisplayElement
import design.patterns.example.observer.interfaces.Observer


class StatisticsDisplay constructor(private val weatherData: WeatherData): Observer, DisplayElement {

    private var temperatureStatistics: Statistics = Statistics()
    private var humidityStatistics: Statistics = Statistics()
    private var pressureStatistics: Statistics = Statistics()

    init {
        weatherData.registryObserver(this)
    }

    override fun display() {
        println("[${this.javaClass.simpleName}] 평균/최저/최고: " +
                "온도 => ${temperatureStatistics.sum/temperatureStatistics.count}/${temperatureStatistics.min}/${temperatureStatistics.max} " +
                "습도 => ${humidityStatistics.sum/humidityStatistics.count}/${humidityStatistics.min}/${humidityStatistics.max} " +
                "기압 => ${pressureStatistics.sum/pressureStatistics.count}/${pressureStatistics.min}/${pressureStatistics.max}")
    }

    override fun update() {
        val weather = weatherData.weather

        temperatureStatistics.let {
            if(it.min > weather.temperature) it.min = weather.temperature
            if(it.max < weather.temperature) it.max = weather.temperature
            it.sum += weather.temperature
            it.count += 1
        }

        humidityStatistics.let {
            if(it.min > weather.humidity) it.min = weather.humidity
            if(it.max < weather.humidity) it.max = weather.humidity
            it.sum += weather.humidity
            it.count += 1
        }

        pressureStatistics.let {
            if(it.min > weather.pressure) it.min = weather.pressure
            if(it.max < weather.pressure) it.max = weather.pressure
            it.sum += weather.pressure
            it.count += 1
        }

        display()
    }
}