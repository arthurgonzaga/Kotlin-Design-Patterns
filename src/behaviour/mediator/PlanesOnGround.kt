import behaviour.mediator.Plane

class PlanesOnGround {
    var planes = ArrayList<Plane>()

    fun addPlane(plane: Plane) {
        planes.add(plane)
    }

    fun removePlane(plane: Plane) {
        planes.remove(plane)
    }
}
