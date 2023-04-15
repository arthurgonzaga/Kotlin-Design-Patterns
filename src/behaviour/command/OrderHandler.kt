package behaviour.command

import behaviour.command.commands.Command

class OrderHandler {
    fun execute(command: Command) = command.execute()
}