package design.patterns.example.facade.subsystems

class Screen {

    fun up() {
        println("${javaClass.simpleName} up")
    }

    fun down() {
        println("${javaClass.simpleName} down")
    }

    override fun toString(): String {
        return super.toString()
    }
}