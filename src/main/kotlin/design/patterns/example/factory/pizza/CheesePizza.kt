package design.patterns.example.factory.pizza

import design.patterns.example.factory.ingredient.PizzaIngredientFactory

class CheesePizza(private val ingredientFactory: PizzaIngredientFactory): Pizza() {

    override var name: String = "Cheese Pizza"

    override fun prepare() {
        this.dough = ingredientFactory.createDough()
        this.sauce = ingredientFactory.createSauce()
        this.cheese = ingredientFactory.createCheese()
    }
}