fun main() {
    while (true) {
        val input = readLine()!!

        if (input == ".") break

        val stack = mutableListOf<Char>()
        var isBalanced = true

        for (ch in input) {
            when (ch) {
                '(' -> stack.add(ch)
                ')' -> {
                    if (stack.isEmpty() || stack.last() != '(') {
                        isBalanced = false
                        break
                    }
                    stack.removeAt(stack.size - 1)
                }
                '[' -> stack.add(ch)
                ']' -> {
                    if (stack.isEmpty() || stack.last() != '[') {
                        isBalanced = false
                        break
                    }
                    stack.removeAt(stack.size - 1)
                }
            }
        }

        if (isBalanced && stack.isEmpty()) {
            println("yes")
        } else {
            println("no")
        }
    }
}