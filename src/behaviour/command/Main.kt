package behaviour.command

import behaviour.command.commands.PlaceOrderCommand
import behaviour.command.commands.ReturnOrderCommand


fun main() {
    val jacket = Jacket()

    with(OrderHandler()) {
        invoke(PlaceOrderCommand(jacket))
        invoke(ReturnOrderCommand(jacket))
    }

}