package behaviour.state.states

import behaviour.state.Fan

interface State {

    fun turnUp(fan: Fan)
    fun turnDown(fan: Fan)
}