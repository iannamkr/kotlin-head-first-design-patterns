package design.patterns.example.factory.store

import design.patterns.example.factory.pizza.Pizza
import design.patterns.example.factory.pizza.PizzaType

abstract class PizzaStore {

    protected abstract fun createPizza(type: PizzaType): Pizza?

    fun orderPizza(type: PizzaType): Pizza? {
        val pizza = createPizza(type)
        pizza?.let {
            pizza.prepare()
            pizza.bake()
            pizza.cut()
            pizza.box()
        }
        return pizza
    }
}