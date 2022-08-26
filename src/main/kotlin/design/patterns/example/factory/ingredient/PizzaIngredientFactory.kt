package design.patterns.example.factory.ingredient

import design.patterns.example.factory.vo.*

interface PizzaIngredientFactory{
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createVeggies(): List<Veggies>
    fun createPepperoni(): Pepperoni
    fun createClam(): Clams
}