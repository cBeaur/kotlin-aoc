import kotlin.math.abs

fun main() {
    fun part1(input: List<String>): Int {
        val test = input.map { line ->
            val first = line.substringBefore(" ").toInt()
            val second = line.substringAfterLast(" ").toInt()
            first to second
        }.unzip()

        val left = test.first.sorted()
        val right = test.second.sorted()

        println(left.size)
        println(right.size)

        var listDistance = 0
        for (i in left.indices) {
            listDistance += abs(left[i] - right[i])
        }

        // Autre solution plus fp
//         val result = left.sorted().zip(right.sorted()).sumOf { (first, second) ->
//             abs(first - second)
//         }

        return listDistance
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // Read the input from the `src/Day01.txt` file.
    val input = readInput("Day01")



    part1(input).println()
//    part2(input)
}
