fun main() {
    val n = readLine()!!.toInt()
    var sugar = n
    var bags = 0

    while (sugar >= 0) {
        if (sugar % 5 == 0) {
            bags += sugar / 5
            println(bags)
            return
        }
        sugar -= 3
        bags++
    }
    println(-1)
}