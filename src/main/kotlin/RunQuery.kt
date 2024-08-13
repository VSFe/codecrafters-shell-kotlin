import command.ShellCommand

fun runQuery(command: String) {
    val commandList = command.split(' ')
    val mainCommand = commandList.first().lowercase()

    ShellCommand.run(mainCommand, commandList.drop(1))
}