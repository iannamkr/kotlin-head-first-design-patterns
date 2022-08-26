import design.patterns.example.command.Command

class Light(
    private val name: String
) {

    fun on() {

    }

    fun off() {

    }
}

class LightOnCommand(
    private val light: Light
): Command() {

    override fun execute() {
        light.on()
        println("Execute Light On")
    }

    override fun undo() {
        light.off()
        println("Execute Light Off")
    }
}

class LightOffCommand(
    private val light: Light
): Command() {

    override fun execute() {
        light.off()
        println("Execute Light Off")
    }

    override fun undo() {
        light.on()
        println("Execute Light On")
    }
}