fun main() {
    fun part1(input: List<String>): Int {
        return 1
    }

    fun part2(input: List<String>): Int {
        return 0
    }

    val testInput = readInput("Day02_test")

    val part1Result = part1(testInput)
    val expected1 = 0
    check(part1Result == expected1) { "Part 1: Expected $expected1, actual $part1Result" }

    val part2Result = part2(testInput)
    val expected2 = 0
    check(part2Result == expected2) { "Part 2: Expected $expected2, actual $part2Result" }

    val input = readInput("Day02")
    part1(input).println()
    part2(input).println()
}
