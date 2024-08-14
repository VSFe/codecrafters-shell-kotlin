package command

import path.PathHolder

fun runPwd(args: List<String>) {
    println(PathHolder.getPresentLocation())
}