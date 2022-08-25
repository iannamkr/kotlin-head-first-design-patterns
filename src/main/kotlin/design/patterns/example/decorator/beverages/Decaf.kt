package design.patterns.example.decorator.beverages

class Decaf: Beverage() {

    override val description: String
        get() = "Decaf"

    override fun cost(): Double {
        return when(size) {
            Size.TALL -> 1.05
            Size.GRANDE -> 2.05
            Size.VENTI -> 3.05
        }
    }
}