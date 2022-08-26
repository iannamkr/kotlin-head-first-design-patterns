import design.patterns.example.command.Command

class Stereo(
    private val location: String
) {

    fun on() {
        println("${this.javaClass.simpleName} On")
    }

    fun off() {
        println("${this.javaClass.simpleName} Off")
    }

    fun setCD() {
        println("${this.javaClass.simpleName} CD")
    }

    fun setDvd() {
        println("${this.javaClass.simpleName} DVD")
    }

    fun setRadio() {
        println("${this.javaClass.simpleName} Radio")
    }

    fun setVolume(volume: Int) {
        println("${this.javaClass.simpleName} volume $volume")
    }
}

class StereoOnForCD(
    private val stereo: Stereo
): Command() {
    override fun execute() {
        stereo.on()
        stereo.setCD()
        stereo.setVolume(10)

        println("Execute Stereo On")
    }

    override fun undo() {
        stereo.off()
        println("Execute Stereo Off")
    }
}

class StereoOff(
    private val stero: Stereo
): Command() {

    override fun execute() {
        stero.off()
        println("Execute Stereo Off")
    }

    override fun undo() {
        stero.on()
        println("Execute Stereo On")
    }
}