package design.patterns.example.observer.interfaces

interface Subject {
    fun registryObserver(o: Observer)
    fun removeObserver(o: Observer)
    fun notifyObserver()
}