private val allChar = ('a'..'z').map { it }
private fun Char.toPair(): Pair<Char, Int> = this to allChar.indexOf(this) + 1
private val map: Map<Char, Int> = mapOf(
        *arrayOf('a', 'e', 'u', 'i', 'o').map { it.toPair() }.toTypedArray()
)

fun main() {
    val letter = readLine()!!.toCharArray()[0].toLowerCase()
    println(map.getOrDefault(letter, 0))
}