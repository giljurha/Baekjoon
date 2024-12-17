fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val input = readLine()!!.trim()
        val stack = mutableListOf<Char>()
        var isValid = true

        for (ch in input) {
            when (ch) {
                '(' -> stack.add(ch)
                ')' -> {
                    if (stack.isEmpty()) {
                        isValid = false
                        break
                    }
                    stack.removeAt(stack.size - 1)
                }
            }
        }
        if (stack.isNotEmpty()) {
            isValid = false
        }
        println(if (isValid) "YES" else "NO")
    }
}