package design.patterns.example.factory.store

import design.patterns.example.factory.ingredient.NYPPizzaIngredientFactory
import design.patterns.example.factory.pizza.*

class NYPizzaStore: PizzaStore() {

    private val ingredientFactory = NYPPizzaIngredientFactory()

    override fun createPizza(type: PizzaType): Pizza? {
        return when(type) {
            PizzaType.CHEESE -> CheesePizza(ingredientFactory).apply { name = "NY Cheese Pizza" }
            PizzaType.VEGGIE -> VeggiePizza(ingredientFactory).apply { name = "NY Veggie Pizza" }
            PizzaType.CLAM -> ClamPizza(ingredientFactory).apply { name = "NY Clam Pizza" }
            PizzaType.PEPPERONI -> PepperoniPizza(ingredientFactory).apply { name = "NY Pepperoni Pizza" }
            else -> null
        }
    }
}