package design.patterns.example.factory.pizza

import design.patterns.example.factory.ingredient.PizzaIngredientFactory

class ClamPizza(private val ingredientFactory: PizzaIngredientFactory): Pizza() {

    override var name: String = "Clam Pizza"

    override fun prepare() {
        this.dough = ingredientFactory.createDough()
        this.sauce = ingredientFactory.createSauce()
        this.cheese = ingredientFactory.createCheese()
        this.clam = ingredientFactory.createClam()
    }
}