private val allChar = ('a'..'z').map { it }
private fun Char.toPair(): Pair<Char, Int> = this to allChar.indexOf(this) + 1
private val map = arrayOf('a', 'e', 'u', 'i', 'o').map { it.toPair() }.toMap()

fun main() {
    val letter = readLine()!!.toCharArray()[0].toLowerCase()
    println(map.getOrDefault(letter, 0))
}