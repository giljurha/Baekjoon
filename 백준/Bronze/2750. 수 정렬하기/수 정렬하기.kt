fun main() {

    val n = readLine()!!.toInt()
    val numbers = mutableListOf<Int>()

    repeat(n) {
        numbers.add(readLine()!!.toInt())
    }

    numbers.sort()

    numbers.forEach { println(it) }
}