package behaviour.state

import behaviour.state.states.OffState
import behaviour.state.states.State

class Fan(
    var state: State = OffState()
) {

    fun turnUp() {
        state.turnUp(fan = this)
        println("Turned up to $state")
    }

    fun turnDown() {
        state.turnDown(fan = this)
        println("Turned down to $state")
    }

}
