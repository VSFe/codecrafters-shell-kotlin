fun main() {
    while (true) {
        print("$ ")
        val command = readln().trim()
        runQuery(command)
    }
}
