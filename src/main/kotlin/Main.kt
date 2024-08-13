fun main() {
    print("$ ")

    while (true) {
        val command = readln().trim()
        runQuery(command)
    }
}
