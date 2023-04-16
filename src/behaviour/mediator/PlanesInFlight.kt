import behaviour.mediator.Plane

class PlanesInFlight {
    var planes = ArrayList<Plane>()

    fun addPlane(plane: Plane) {
        planes.add(plane)
    }

    fun removePlane(plane: Plane) {
        planes.remove(plane)
    }
}
