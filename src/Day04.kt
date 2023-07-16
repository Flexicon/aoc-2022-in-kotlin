fun main() {
    fun String.toRange(): IntRange = split("-")
        .map { it.toInt() }
        .let { (from, to) -> from..to }

    fun List<String>.toRangePairs() = map {
        it.split(",").map { r -> r.toRange() }
    }

    fun IntRange.contains(other: IntRange): Boolean =
        (other.first in this) && (other.last in this)

    fun IntRange.overlapsWith(other: IntRange): Boolean =
        (other.first in this) || (other.last in this)

    fun part1(input: List<String>): Int = input.toRangePairs()
        .count { (r1, r2) -> r1.contains(r2) || r2.contains(r1) }

    fun part2(input: List<String>): Int = input.toRangePairs()
        .count { (r1, r2) -> r1.overlapsWith(r2) || r2.overlapsWith(r1) }

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
