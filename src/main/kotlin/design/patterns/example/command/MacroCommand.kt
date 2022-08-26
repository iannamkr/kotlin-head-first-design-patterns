package design.patterns.example.command

class MacroCommand(
    val commands: Array<Command> = arrayOf()
): Command() {

    override fun execute() {
        for(command in commands) {
            command.execute()
        }
    }

    override fun undo() {
        for(command in commands) {
            command.undo()
        }
    }
}