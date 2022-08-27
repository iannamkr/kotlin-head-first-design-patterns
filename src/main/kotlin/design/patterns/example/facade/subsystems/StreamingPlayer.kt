package design.patterns.example.facade.subsystems

class StreamingPlayer(
    private val amplifier: Amplifier
) {

    fun on() {
        println("${javaClass.simpleName} on")
    }

    fun off() {
        println("${javaClass.simpleName} off")
    }

    fun pause() {
        println("${javaClass.simpleName} pause")
    }

    fun play(movie: String) {
        println("${javaClass.simpleName} play $movie")
    }

    fun setSurroundAudio() {
        println("${javaClass.simpleName} surround audio")
    }

    fun setTwoChannelAudio() {
        println("${javaClass.simpleName} two channel audio")
    }

    fun stop() {
        println("${javaClass.simpleName} stop")
    }

    override fun toString(): String {
        return super.toString()
    }
}