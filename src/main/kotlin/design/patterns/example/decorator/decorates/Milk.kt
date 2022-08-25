package design.patterns.example.decorator.decorates

import design.patterns.example.decorator.beverages.Beverage

class Milk constructor(private val beverage: Beverage) : CondimentDecorator() {

    override val description: String
        get() = beverage.description + ", ${this.javaClass.simpleName}"

    override fun cost(): Double {
        return when(beverage.size) {
            Size.TALL -> beverage.cost() + .10
            Size.GRANDE -> beverage.cost() + .15
            Size.VENTI -> beverage.cost() + .20
        }
    }
}