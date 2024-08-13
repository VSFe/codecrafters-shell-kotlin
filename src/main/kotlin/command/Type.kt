package command

import java.io.File

fun runType(args: List<String>) {
    BuiltinShellCommand.entries.firstOrNull { it.command == args[0] } ?.let {
        println("${it.command} is a shell builtin")
        return
    }

    resolvePath(args[0]) ?.let {
        println("${args[0]} is $it")
    } ?: println("${args[0]}: not found")
}

fun resolvePath(arg: String): String? {
    return System.getenv("PATH")
        ?.split(":")
        ?.map { File(it, arg) }
        ?.firstOrNull { it.exists() }
        ?.absolutePath
}