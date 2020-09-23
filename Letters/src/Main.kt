import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var letter = ""
    var i = 1
    var result = "null"
    while (scanner.hasNext()) {
        letter = scanner.next()
        if (i++ == 4) {
            result = letter
        }
        if (letter == "z") {
            break
        }
    }
    print(result)
}