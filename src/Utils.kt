import java.io.File
import java.math.BigInteger
import java.security.MessageDigest

/**
 * Reads lines from the given input txt file.
 */
fun readInput(name: String) = File("src", "files/$name.txt")
    .readLines()

/**
 * Converts string to md5 hash.
 */
fun String.md5() = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray()))
    .toString(16)
    .padStart(32, '0')

/**
 * The cleaner shorthand for printing output.
 */
fun Any?.println() = println(this)

/**
 * Split [List] into blank-string-separated blocks, and perform a [transform] operation on each,
 * returning the resulting [List] of transformed elements of type [R].
 */
fun <R> List<String>.blocks(transform: (List<String>) -> R): List<R> = buildList {
    this@blocks.fold(listOf<String>()) { current, line ->
        if (line.isNotBlank()) {
            current + line
        } else {
            add(transform(current))
            mutableListOf()
        }
    }.takeIf { it.isNotEmpty() }?.let { add(transform(it)) }
}
