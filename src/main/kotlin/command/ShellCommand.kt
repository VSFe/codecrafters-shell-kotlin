package command

enum class ShellCommand(
    val command: String,
    val execution: (List<String>) -> Unit
) {
    EXIT("exit", ::runExit);

    companion object {
        fun run(mainCommand: String, args: List<String>) {
            entries.find { it.command == mainCommand }?.execution?.invoke(args)
                ?: println("$mainCommand: command not found")
        }
    }
}