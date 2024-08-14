package command

enum class BuiltinShellCommand(
    val command: String,
    val execution: (List<String>) -> Unit
) {
    EXIT("exit", ::runExit),
    ECHO("echo", ::runEcho),
    TYPE("type", ::runType),
    PWD("pwd", ::runPwd),
    CD("cd", ::runCd)
    ;

    companion object {
        fun run(mainCommand: String, args: List<String>) {
            entries.find { it.command == mainCommand }?.execution?.invoke(args)
                ?: println("$mainCommand: command not found")
        }
    }
}