fun main() {
    fun part1(input: List<String>): Int {
        return input.sumOf { line ->
            (line[2] - Char(87)) + when (line) {
                "A X", "B Y", "C Z" -> 3
                "A Y", "B Z", "C X" -> 6
                else -> 0
            }
        }
    }

    fun part2(input: List<String>): Int {
        fun Int.inBounds() = when {
            this <= 0 -> 3
            this > 3 -> 1
            else -> this
        }

        return input.sumOf { line ->
            val opponent = line[0] - Char(64)

            when (line[2]) {
                'X' -> 0 + (opponent - 1).inBounds()
                'Y' -> 3 + opponent
                else -> 6 + (opponent + 1).inBounds()
            }
        }
    }

    val testInput = readInput("Day02_test")

    val part1Result = part1(testInput)
    val expected1 = 15
    check(part1Result == expected1) { "Part 1: Expected $expected1, actual $part1Result" }

    val part2Result = part2(testInput)
    val expected2 = 12
    check(part2Result == expected2) { "Part 2: Expected $expected2, actual $part2Result" }

    val input = readInput("Day02")
    part1(input).println()
    part2(input).println()
}
