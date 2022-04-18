import java.io.File

fun main() {
    var count = 0
    val fileName = "src/words_with_numbers.txt"
    val lines = File(fileName).readLines().forEach { if (it.first().isDigit()) count++ }
    print(count)
}