import java.util.PriorityQueue

data class Edge(val to: Int, val weight: Int)
data class Node(val vertex: Int, val distance: Int) : Comparable<Node> {
    override fun compareTo(other: Node): Int = this.distance - other.distance
}

fun main() {
    val (v, e) = readln().split(" ").map { it.toInt() }
    val start = readln().toInt()

    // 그래프 초기화
    val graph = Array(v + 1) { mutableListOf<Edge>() }
    repeat(e) {
        val (u, v, w) = readln().split(" ").map { it.toInt() }
        graph[u].add(Edge(v, w))
    }

    // 다익스트라 알고리즘
    val distances = IntArray(v + 1) { Int.MAX_VALUE }
    distances[start] = 0
    val priorityQueue = PriorityQueue<Node>()
    priorityQueue.add(Node(start, 0))

    while (priorityQueue.isNotEmpty()) {
        val (current, currentDistance) = priorityQueue.poll()
        if (currentDistance > distances[current]) continue

        for (edge in graph[current]) {
            val newDistance = currentDistance + edge.weight
            if (newDistance < distances[edge.to]) {
                distances[edge.to] = newDistance
                priorityQueue.add(Node(edge.to, newDistance))
            }
        }
    }

    // 결과 출력
    val result = buildString {
        for (i in 1..v) {
            appendLine(if (distances[i] == Int.MAX_VALUE) "INF" else distances[i])
        }
    }
    print(result)
}