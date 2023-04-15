package behaviour.state.states

import behaviour.state.Fan

class MediumState: State {

    override fun turnUp(fan: Fan) {
        fan.state = HighState()
    }

    override fun turnDown(fan: Fan) {
        fan.state = LowState()
    }

    override fun toString(): String = "Medium"
}