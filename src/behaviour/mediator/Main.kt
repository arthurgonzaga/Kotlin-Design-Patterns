package behaviour.mediator

fun main() {
    val mediator = Mediator()

    val plane1 = Plane(id = 1)
    val plane2 = Plane(id = 2)

    mediator.takeOff(plane1)
    mediator.takeOff(plane2)
}