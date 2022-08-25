package design.patterns.example.decorator.beverages

class DarkRoast: Beverage() {

    override val description: String
        get() = "DarkRoast"

    override fun cost(): Double {
        return when(size) {
            Size.TALL -> .99
            Size.GRANDE -> 1.99
            Size.VENTI -> 2.99
        }
    }
}