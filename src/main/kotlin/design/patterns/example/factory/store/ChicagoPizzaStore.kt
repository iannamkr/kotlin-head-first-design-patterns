package design.patterns.example.factory.store

import design.patterns.example.factory.ingredient.ChicagoPizzaIngredientFactory
import design.patterns.example.factory.pizza.*

class ChicagoPizzaStore: PizzaStore() {

    private val ingredientFactory = ChicagoPizzaIngredientFactory()

    override fun createPizza(type: PizzaType): Pizza? {
        return when(type) {
            PizzaType.CHEESE -> CheesePizza(ingredientFactory).apply { name = "Chicago Cheese Pizza" }
            PizzaType.VEGGIE -> VeggiePizza(ingredientFactory).apply { name = "Chicago Veggie Pizza" }
            PizzaType.CLAM -> ClamPizza(ingredientFactory).apply { name = "Chicago Clam Pizza" }
            PizzaType.PEPPERONI -> PepperoniPizza(ingredientFactory).apply { name = "Chicago Pepperoni Pizza" }
            else -> null
        }
    }
}