package command

import kotlin.system.exitProcess

fun runExit(args: List<String>) {
    exitProcess(args[0].toInt())
}