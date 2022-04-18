import java.io.File

fun main() {
    val files: File = File("src/basedir")
    val dicEmpty = mutableListOf<String>()
    files.walk(FileWalkDirection.TOP_DOWN).forEach { if (it.listFiles()?.isEmpty() == true) dicEmpty.add(it.toString()) }
    println(dicEmpty)
}