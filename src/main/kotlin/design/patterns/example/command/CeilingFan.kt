import design.patterns.example.command.Command


class CeilingFan(
    private val location: String
) {
    enum class SPEED(speed: Int) {
        HIGH(3), MEDIUM(2), LOW(1), OFF(0);

        companion object {
            operator fun invoke(type: String) = valueOf(type)
        }
    }

    private var speed: SPEED = SPEED.OFF

    fun high() {
        speed = SPEED.HIGH
    }

    fun medium() {
        speed = SPEED.MEDIUM
    }

    fun low() {
        speed = SPEED.LOW
    }

    fun off() {
        speed = SPEED.OFF
    }

    fun getSpeed(): SPEED {
        return speed
    }
}

class CeilingFanHighCommand(
    private val ceilingFan: CeilingFan
): Command() {

    private var prevSpeed: CeilingFan.SPEED = ceilingFan.getSpeed()

    override fun execute() {
        prevSpeed = ceilingFan.getSpeed()
        ceilingFan.high()

        println("Execute CeilingFanHigh")
    }

    override fun undo() {
        when(prevSpeed) {
            CeilingFan.SPEED.OFF -> ceilingFan.off()
            CeilingFan.SPEED.LOW -> ceilingFan.low()
            CeilingFan.SPEED.MEDIUM -> ceilingFan.medium()
            CeilingFan.SPEED.HIGH -> ceilingFan.high()
        }
    }
}

class CeilingFanOffCommand(
    private val ceilingFan: CeilingFan
): Command() {

    private var prevSpeed: CeilingFan.SPEED = ceilingFan.getSpeed()

    override fun execute() {
        prevSpeed = ceilingFan.getSpeed()
        ceilingFan.off()
    }

    override fun undo() {
        when(prevSpeed) {
            CeilingFan.SPEED.OFF -> ceilingFan.off()
            CeilingFan.SPEED.LOW -> ceilingFan.low()
            CeilingFan.SPEED.MEDIUM -> ceilingFan.medium()
            CeilingFan.SPEED.HIGH -> ceilingFan.high()
        }
    }
}