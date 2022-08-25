package design.patterns.example.decorator

import design.patterns.example.decorator.beverages.Beverage
import design.patterns.example.decorator.beverages.DarkRoast
import design.patterns.example.decorator.beverages.Espresso
import design.patterns.example.decorator.beverages.HouseBlend
import design.patterns.example.decorator.decorates.Mocha
import design.patterns.example.decorator.decorates.Soy
import design.patterns.example.decorator.decorates.Whip


fun main() {

    val beverage1 = Espresso()
    beverage1.size = Beverage.Size.VENTI
    println("${beverage1.description} $${beverage1.cost()}")

    var beverage2: Beverage = DarkRoast()
    beverage2 = Mocha(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)
    println("${beverage2.description} $${beverage2.cost()}")

    var beverage3: Beverage = HouseBlend()
    beverage3.size = Beverage.Size.GRANDE
    beverage3 = Soy(beverage3)
    beverage3 = Mocha(beverage3)
    beverage3 = Whip(beverage3)
    println("${beverage3.description} $${beverage3.cost()}")
}
