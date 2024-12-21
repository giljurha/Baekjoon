fun main() {
    val n = readLine()!!.toInt()
    val words = mutableSetOf<String>()

    repeat(n) {
        words.add(readLine()!!)
    }

    val sortedWords = words.sortedWith(compareBy({ it.length }, { it }))

    sortedWords.forEach { println(it) }
}