package design.patterns.example.factory.ingredient

import design.patterns.example.factory.vo.*

class ChicagoPizzaIngredientFactory: PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThickCrustDough()
    }

    override fun createSauce(): Sauce {
        return PlumTomatoSauce()
    }

    override fun createCheese(): Cheese {
        return MozzarellaChesse()
    }

    override fun createVeggies(): List<Veggies> {
        return listOf(BlackOlive(), Garlic(), Eggplant(), Spinach())
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createClam(): Clams {
        return FreshClams()
    }
}