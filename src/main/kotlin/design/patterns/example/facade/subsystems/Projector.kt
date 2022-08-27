package design.patterns.example.facade.subsystems

class Projector(
    private val player: StreamingPlayer
) {

    fun on() {
        println("${javaClass.simpleName} on")
    }

    fun off() {
        println("${javaClass.simpleName} off")
    }

    fun tvMode() {
        println("${javaClass.simpleName} tv mode")
    }

    fun wideScreenMode() {
        println("${javaClass.simpleName} wide screen mode")
    }

    override fun toString(): String {
        return super.toString()
    }
}