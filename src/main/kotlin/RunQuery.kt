fun runQuery(command: String) {
    val commandList = command.split(' ')
    val mainCommand = commandList.first().lowercase()

    println("$mainCommand: command not found")
}