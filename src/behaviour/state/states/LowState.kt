package behaviour.state.states

import behaviour.state.Fan

class LowState: State {

    override fun turnUp(fan: Fan) {
        fan.state = MediumState()
    }

    override fun turnDown(fan: Fan) {
        fan.state = OffState()
    }

    override fun toString(): String = "Low"
}