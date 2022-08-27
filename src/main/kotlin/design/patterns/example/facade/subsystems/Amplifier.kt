package design.patterns.example.facade.subsystems

class Amplifier {

    lateinit var tuner: Tuner
    lateinit var player: StreamingPlayer

    var volume: Int = 0
    var stereoSound: Boolean = false
    var surroundSound: Boolean = false

    fun on() { }

    fun off() { }

    override fun toString(): String {
        return super.toString()
    }
}