fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    val testInput = readInput("Day01_test")

    val part1Result = part1(testInput)
    check(part1Result == 1) { "Part 1: Expected 1, actual $part1Result" }

    val part2Result = part2(testInput)
    check(part2Result == 2) { "Part 2: Expected 2, actual $part2Result" }

    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}
