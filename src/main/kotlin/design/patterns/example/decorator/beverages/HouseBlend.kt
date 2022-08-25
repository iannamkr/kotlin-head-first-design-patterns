package design.patterns.example.decorator.beverages

class HouseBlend: Beverage() {

    override val description: String
        get() = "HouseBlend"

    override fun cost(): Double {
        return when(size) {
            Size.TALL -> .89
            Size.GRANDE -> 1.89
            Size.VENTI -> 2.89
        }
    }
}