package command

import path.PathHolder

fun runCd(args: List<String>) {
    if (!args[0].startsWith(".")) {
        if (!PathHolder.changeAbsolutePath(args[0])) {
            println("cd: ${args[0]}: No such file or directory")
        }
    }
}