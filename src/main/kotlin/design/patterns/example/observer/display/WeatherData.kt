package design.patterns.example.observer.display

import design.patterns.example.observer.interfaces.Observer
import design.patterns.example.observer.interfaces.Subject


class WeatherData(
    private val observers: MutableList<Observer> = mutableListOf()
): Subject {

    lateinit var weather: Weather

    override fun registryObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        observers.remove(o)
    }

    override fun notifyObserver() {
        for(o in observers)
            o.update()
    }

    fun measurementsChanged() {
        notifyObserver()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        weather = Weather(temperature, humidity, pressure)
        measurementsChanged()
    }
}