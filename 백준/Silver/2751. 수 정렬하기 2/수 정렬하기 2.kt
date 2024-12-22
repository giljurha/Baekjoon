fun main() {
    val reader = System.`in`.bufferedReader()
    val writer = System.out.bufferedWriter()

    val n = reader.readLine().toInt()

    val numbers = MutableList(n) { reader.readLine().toInt() }
    numbers.sort()

    for (num in numbers) {
        writer.write("$num\n")
    }

    writer.flush()
    writer.close()
}