package command

import path.PathHolder

fun runCd(args: List<String>) {
    when {
        args[0].startsWith(".") -> {
            if (!PathHolder.changeRelativePath(args[0])) {
                println("cd: ${PathHolder.getCanonicalPath(args[0])}: No such file or directory")
            }
        }
        args[0] == "~" -> {
            val path = System.getenv("HOME")
            PathHolder.changeAbsolutePath(path)
        }
        else -> {
            if (!PathHolder.changeAbsolutePath(args[0])) {
                println("cd: ${args[0]}: No such file or directory")
            }
        }
    }
}