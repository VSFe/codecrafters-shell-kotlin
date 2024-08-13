package command

fun runType(args: List<String>) {
    BuiltinShellCommand.entries.find { it.command == args[0] } ?.let {
        println("${it.command} is a shell builtin")
    } ?: println("${args[0]}: not found")
}