fun main() {
    fun String.splitInHalf(): List<String> = (length / 2).let {
        listOf(substring(0, it), substring(it))
    }

    fun Char.priority(): Int = code - if (isLowerCase()) 96 else 38

    fun part1(input: List<String>): Int = input
        .map { it.splitInHalf() }
        .sumOf { (left, right) ->
            right.find { left.contains(it) }?.priority() ?: 0
        }

    fun part2(input: List<String>): Int = input.windowed(3, 3)
        .sumOf { (first, second, third) ->
            first.find { second.contains(it) && third.contains(it) }?.priority() ?: 0
        }

    val testInput = readInput("Day03_test")

    val part1Result = part1(testInput)
    val expected1 = 157
    check(part1Result == expected1) { "Part 1: Expected $expected1, actual $part1Result" }

    val part2Result = part2(testInput)
    val expected2 = 70
    check(part2Result == expected2) { "Part 2: Expected $expected2, actual $part2Result" }

    val input = readInput("Day03")
    part1(input).println()
    part2(input).println()
}
