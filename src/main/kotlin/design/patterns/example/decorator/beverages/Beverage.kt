package design.patterns.example.decorator.beverages

abstract class Beverage {
    enum class Size { TALL, GRANDE, VENTI }
    var size: Size = Size.TALL
    open val description: String = "Beverage"
    abstract fun cost(): Double
}