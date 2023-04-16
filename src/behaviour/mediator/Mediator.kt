package behaviour.mediator

import PlanesInFlight
import PlanesOnGround
import Runway

class Mediator(
    private val runway: Runway = Runway(),
    private val planesInFlight: PlanesInFlight = PlanesInFlight(),
    private val planesOnGround: PlanesOnGround = PlanesOnGround(),
) {

    fun takeOff(plane: Plane) {
        if (!plane.isInTheAir && runway.isAvailable) {
            runway.isAvailable = false
            println("Plane ${plane.id} is taking off...")
            planesOnGround.removePlane(plane)
            planesInFlight.addPlane(plane)
            plane.isInTheAir = true
            runway.isAvailable = true
        }
    }
}