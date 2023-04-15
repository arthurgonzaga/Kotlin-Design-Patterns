package behaviour.state.states

import behaviour.state.Fan

class OffState: State {

    override fun turnUp(fan: Fan) {
        fan.state = LowState()
    }

    override fun turnDown(fan: Fan) {
        fan.state = OffState()
    }

    override fun toString(): String = "Off"
}