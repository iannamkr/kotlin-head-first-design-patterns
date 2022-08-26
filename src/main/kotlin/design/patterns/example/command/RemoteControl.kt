package design.patterns.example.command

class RemoteControl {

    private val MAX_COMMAND = 7
    var undo: Command = NoCommand()

    val onCommands: Array<Command> = Array(MAX_COMMAND) { NoCommand() }
    val offCommands: Array<Command> = Array(MAX_COMMAND) { NoCommand() }

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot].execute()
        undo = onCommands[slot]
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot].execute()
        undo = offCommands[slot]
    }

    override fun toString(): String {
        return onCommands.foldIndexed("") { index, acc, next ->
            "${acc}\n[$index]$next\t${offCommands[index]}"
        }
    }
}