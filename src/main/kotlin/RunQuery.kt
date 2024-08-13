import command.BuiltinShellCommand
import command.resolvePath
import java.io.BufferedReader
import java.io.InputStreamReader

fun runQuery(command: String) {
    val commandList = command.split(' ')
    val mainCommand = commandList.first().lowercase()
    val args = commandList.drop(1)

    BuiltinShellCommand.entries.firstOrNull { it.command == mainCommand } ?.execution?.invoke(args)
        ?: resolvePath(mainCommand) ?.let { println(executeCommand(it, args).trim()) }
        ?: println("$mainCommand: command not found")
}

private fun executeCommand(command: String, args: List<String>): String {
    val process = ProcessBuilder(command, *args.toTypedArray()).start()
    val reader = BufferedReader(InputStreamReader(process.inputStream))

    return reader.readText()
}