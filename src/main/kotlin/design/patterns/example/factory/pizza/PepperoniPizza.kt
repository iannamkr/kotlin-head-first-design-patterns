package design.patterns.example.factory.pizza

import design.patterns.example.factory.ingredient.PizzaIngredientFactory

class PepperoniPizza(private val ingredientFactory: PizzaIngredientFactory): Pizza() {

    override var name: String = "Pepperoni Pizza"

    override fun prepare() {
        this.dough = ingredientFactory.createDough()
        this.sauce = ingredientFactory.createSauce()
        this.cheese = ingredientFactory.createCheese()
        this.pepperoni = ingredientFactory.createPepperoni()
    }
}