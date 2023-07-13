fun main() {
    fun part1(input: List<String>): Int = 0

    fun part2(input: List<String>): Int = 0

    val testInput = readInput("Day04_test")

    val part1Result = part1(testInput)
    val expected1 = 2
    check(part1Result == expected1) { "Part 1: Expected $expected1, actual $part1Result" }

    val part2Result = part2(testInput)
    val expected2 = 4
    check(part2Result == expected2) { "Part 2: Expected $expected2, actual $part2Result" }

    val input = readInput("Day04")
    part1(input).println()
    part2(input).println()
}
