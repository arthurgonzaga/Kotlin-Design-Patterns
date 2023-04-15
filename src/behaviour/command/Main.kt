package behaviour.command

import behaviour.command.commands.PlaceOrderCommand
import behaviour.command.commands.ReturnOrderCommand


fun main() {
    val jacket = Jacket()

    val placeOrderHandler = OrderHandler()
    val returnOrderHandler = OrderHandler()

    placeOrderHandler.execute(PlaceOrderCommand(jacket))
    returnOrderHandler.execute(ReturnOrderCommand(jacket))
}