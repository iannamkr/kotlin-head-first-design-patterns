package design.patterns.example.facade.subsystems

class TheaterLights {

    fun on() {
        println("${javaClass.simpleName} on")
    }

    fun off() {
        println("${javaClass.simpleName} off")
    }

    fun dim(level: Int) {
        println("${javaClass.simpleName} dim: $level")
    }

    override fun toString(): String {
        return super.toString()
    }
}