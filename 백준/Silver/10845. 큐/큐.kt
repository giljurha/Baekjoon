import java.util.LinkedList
import java.util.Queue

fun main() {
    val queue: Queue<Int> = LinkedList()
    val n = readLine()!!.toInt()
    val sb = StringBuilder()

    repeat(n) {
        val command = readLine()!!.split(" ")
        when (command[0]) {
            "push" -> queue.add(command[1].toInt())
            "pop" -> sb.appendLine(if (queue.isEmpty()) -1 else queue.poll())
            "size" -> sb.appendLine(queue.size)
            "empty" -> sb.appendLine(if (queue.isEmpty()) 1 else 0)
            "front" -> sb.appendLine(if (queue.isEmpty()) -1 else queue.peek())
            "back" -> sb.appendLine(if (queue.isEmpty()) -1 else queue.last())
        }
    }
    println(sb.toString())
}

