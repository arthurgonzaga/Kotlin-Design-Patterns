package behaviour.command.commands

import behaviour.command.Jacket

class ReturnOrderCommand(
    private val jacket: Jacket
): Command {

    override fun execute() {
        jacket.returnOrder()
    }

}