package design.patterns.example.factory

import design.patterns.example.factory.pizza.PizzaType
import design.patterns.example.factory.store.ChicagoPizzaStore
import design.patterns.example.factory.store.NYPizzaStore


fun main() {
    val ny_store = NYPizzaStore()
    val chicago_store = ChicagoPizzaStore()

    val nyCheezePizza = ny_store.orderPizza(PizzaType.CHEESE)
    println("happy enjoy ${nyCheezePizza.toString()}")

    val chicagoClamPizza = chicago_store.orderPizza(PizzaType.CLAM)
    println("happy enjoy ${chicagoClamPizza.toString()}")
}
