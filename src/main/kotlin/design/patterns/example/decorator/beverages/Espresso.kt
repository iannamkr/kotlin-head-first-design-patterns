package design.patterns.example.decorator.beverages

class Espresso: Beverage() {

    override val description: String
        get() = "Espresso"

    override fun cost(): Double {
        return when(size) {
            Size.TALL -> 1.99
            Size.GRANDE -> 2.99
            Size.VENTI -> 3.99
        }
    }
}