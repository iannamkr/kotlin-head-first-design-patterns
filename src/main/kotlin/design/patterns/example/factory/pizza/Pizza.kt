package design.patterns.example.factory.pizza

import design.patterns.example.factory.vo.*


abstract class Pizza {

    abstract var name: String
    var dough: Dough? = null
    var sauce: Sauce? = null
    var cheese: Cheese? = null
    var pepperoni: Pepperoni? = null
    var clam: Clams? = null
    var veggies: List<Veggies>? = null

    abstract fun prepare()

    open fun bake() {
        println("baking...")
    }

    open fun cut() {
        println("cutting...")
    }

    open fun box() {
        println("packing...")
    }

    override fun toString(): String {
        return name
    }
}