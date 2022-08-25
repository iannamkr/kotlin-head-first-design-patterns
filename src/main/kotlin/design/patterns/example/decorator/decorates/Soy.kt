package design.patterns.example.decorator.decorates

import design.patterns.example.decorator.beverages.Beverage

class Soy(private val beverage: Beverage) : CondimentDecorator() {

    override val description: String
        get() = beverage.description + ", ${this.javaClass.simpleName}"

    override fun cost(): Double {
        return when(beverage.size) {
            Size.TALL -> beverage.cost() + .15
            Size.GRANDE -> beverage.cost() + .20
            Size.VENTI -> beverage.cost() + .25
        }
    }
}