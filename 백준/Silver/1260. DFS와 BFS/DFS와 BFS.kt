import java.util.LinkedList
import java.util.Queue
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val m = scanner.nextInt()
    val v = scanner.nextInt()

    val graph = Array(n + 1) { mutableListOf<Int>() }
    repeat(m) {
        val a = scanner.nextInt()
        val b = scanner.nextInt()
        graph[a].add(b)
        graph[b].add(a)
    }

    graph.forEach { it.sort() }

    val visitedDFS = BooleanArray(n + 1)
    dfs(graph, v, visitedDFS)
    println()

    bfs(graph, v, n)
}

fun dfs(graph: Array<MutableList<Int>>, node: Int, visited: BooleanArray) {
    visited[node] = true
    print("$node ")

    for (neighbor in graph[node]) {
        if (!visited[neighbor]) {
            dfs(graph, neighbor, visited)
        }
    }
}

fun bfs(graph: Array<MutableList<Int>>, start: Int, n: Int) {
    val visited = BooleanArray(n + 1)
    val queue: Queue<Int> = LinkedList()

    queue.add(start)
    visited[start] = true

    while (queue.isNotEmpty()) {
        val node = queue.poll()
        print("$node ")

        for (neighbor in graph[node]) {
            if (!visited[neighbor]) {
                queue.add(neighbor)
                visited[neighbor] = true
            }
        }
    }
}