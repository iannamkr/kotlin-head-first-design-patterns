package design.patterns.example.facade.subsystems

class PopcornPopper {

    fun on() {
        println("${javaClass.simpleName} on")
    }

    fun off() {
        println("${javaClass.simpleName} off")
    }

    fun pop() {
        println("${javaClass.simpleName} pop")
    }

    override fun toString(): String {
        return super.toString()
    }
}