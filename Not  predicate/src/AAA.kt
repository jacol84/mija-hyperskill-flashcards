import java.io.File

fun main() {
    val fileName = "G:\\praca\\app\\Flashcards\\Problems\\Not  predicate\\src\\main.txt"
    val linesLength = File(fileName).length()
    val lines = File(fileName).readLines().size
    print("$linesLength $lines")
}