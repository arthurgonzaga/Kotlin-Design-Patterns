package behaviour.state.states

import behaviour.state.Fan

class HighState: State {

    override fun turnUp(fan: Fan) {
        fan.state = HighState()
    }

    override fun turnDown(fan: Fan) {
        fan.state = MediumState()
    }

    override fun toString(): String = "High"
}