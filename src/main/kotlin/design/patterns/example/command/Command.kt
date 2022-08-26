package design.patterns.example.command

abstract class Command {
    open fun execute() {}
    open fun undo() {}

    override fun toString(): String {
        return this.javaClass.simpleName
    }
}