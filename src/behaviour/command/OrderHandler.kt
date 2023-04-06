package behaviour.command

import behaviour.command.commands.Command

class OrderHandler {
    operator fun invoke(command: Command) = command.execute()
}