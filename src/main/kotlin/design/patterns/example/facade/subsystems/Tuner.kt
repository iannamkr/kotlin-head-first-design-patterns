package design.patterns.example.facade.subsystems

class Tuner(
    private val amplifier: Amplifier
) {
    fun on() {
        println("${javaClass.simpleName} on")
    }

    fun off() {
        println("${javaClass.simpleName} off")
    }

    fun setAm(channel: String) {
        println("${javaClass.simpleName} am: $channel")
    }

    fun setFm(channel: String) {
        println("${javaClass.simpleName} fm: $channel")
    }

    fun setFrequency(level: Int) {
        println("${javaClass.simpleName} frequency: $level")
    }

    override fun toString(): String {
        return super.toString()
    }
}