package design.patterns.example.facade

fun main() {

    val homeTheater = HomeTheaterFacadeFactory.createFacade()

    homeTheater.watchMovie("toy story")
    homeTheater.endMovie()
    homeTheater.listenToRadio()
    homeTheater.endRadio()
}
