import java.io.File

fun main() {
    var count = 0
    //val fileName = "src/words_with_numbers.txt"
    val wordsSequence = "src/words_sequence.txt"
    val wordsNumbers = "src/text.txt"

    //File(fileName).readLines().forEach { if (it.first().isDigit()) count++ }
    //print(count)

//    val line = File(wordsSequence).readLines()
//    var temp: String = line[0]
//
//    for (i in line.indices) {
//        if (temp.length < line[i].length) temp = line[i]
//        //println(line[i])
//    }
//
    val line = File(wordsNumbers).readText().split(" ").size
    print(line)


}