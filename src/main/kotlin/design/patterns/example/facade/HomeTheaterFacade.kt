package design.patterns.example.facade

import design.patterns.example.facade.subsystems.*

class HomeTheaterFacade(
    private var amp: Amplifier,
    private var tuner: Tuner,
    private var screen: Screen,
    private var popper: PopcornPopper,
    private var lights: TheaterLights,
    private var projector: Projector,
    private var player: StreamingPlayer
) {
    fun watchMovie(movie: String) {
        popper.on()
        popper.pop()
        lights.dim(10)
        screen.down()
        projector.on()
        projector.wideScreenMode()
        amp.on()
        amp.player = player
        amp.surroundSound = true
        amp.volume = 5
        player.on()
        player.play(movie)
    }

    fun endMovie() {
        popper.off()
        lights.on()
        screen.up()
        projector.off()
        amp.off()
        player.stop()
        player.off()
    }

    fun listenToRadio() { }
    fun endRadio() { }
}

class HomeTheaterFacadeFactory {
    companion object {
        fun createFacade(): HomeTheaterFacade {

            val amplifier = Amplifier()
            val tuner = Tuner(amplifier)
            val player = StreamingPlayer(amplifier)
            val projector = Projector(player)
            val lights = TheaterLights()
            val popper = PopcornPopper()
            val screen = Screen()

            return HomeTheaterFacade(
                amp = amplifier,
                tuner = tuner,
                screen = screen,
                popper = popper,
                lights = lights,
                projector = projector,
                player = player
            )
        }
    }
}