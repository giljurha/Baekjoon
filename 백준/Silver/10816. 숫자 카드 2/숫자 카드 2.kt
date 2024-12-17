fun main() {
    val n = readLine()!!.toInt()
    val cards = readLine()!!.split(" ").map { it.toInt() }
    val cardCount = mutableMapOf<Int, Int>()

    for (card in cards) {
        cardCount[card] = cardCount.getOrDefault(card, 0) + 1
    }

    val m = readLine()!!.toInt()
    val query = readLine()!!.split(" ").map { it.toInt() }
    val result = query.map { cardCount.getOrDefault(it, 0) }
    println(result.joinToString(" "))
}