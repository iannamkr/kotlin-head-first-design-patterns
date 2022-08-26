import design.patterns.example.command.Command

class GarageDoor {

    fun up() {

    }

    fun down() {

    }
}

class GarageDoorOpenCommand(
    private val garageDoor: GarageDoor
): Command() {

    override fun execute() {
        garageDoor.up()
        println("Execute GarageDoorOpen")
    }

    override fun undo() {
        garageDoor.down()
    }
}

class GarageDoorCloseCommand(
    private val garageDoor: GarageDoor
): Command() {
    override fun execute() {
        garageDoor.down()
    }

    override fun undo() {
        garageDoor.up()
    }
}