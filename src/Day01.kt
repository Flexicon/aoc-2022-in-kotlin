fun main() {
    fun sumTop(input: List<String>, n: Int): Int {
        return input.blocks { backpack -> backpack.sumOf { it.toInt() } }
            .sorted()
            .takeLast(n)
            .sum()
    }

    fun part1(input: List<String>): Int {
        return sumTop(input, 1)
    }

    fun part2(input: List<String>): Int {
        return sumTop(input, 3)
    }

    val testInput = readInput("Day01_test")

    val part1Result = part1(testInput)
    val expected1 = 24000
    check(part1Result == expected1) { "Part 1: Expected $expected1, actual $part1Result" }

    val part2Result = part2(testInput)
    val expected2 = 45000
    check(part2Result == expected2) { "Part 2: Expected $expected2, actual $part2Result" }

    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}
