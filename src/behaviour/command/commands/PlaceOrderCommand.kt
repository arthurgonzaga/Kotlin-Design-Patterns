package behaviour.command.commands

import behaviour.command.Jacket

class PlaceOrderCommand(
    private val jacket: Jacket
): Command {
    override fun execute() {
        jacket.placeOrder()
    }

}