import command.BuiltinShellCommand

fun runQuery(command: String) {
    val commandList = command.split(' ')
    val mainCommand = commandList.first().lowercase()

    BuiltinShellCommand.run(mainCommand, commandList.drop(1))
}