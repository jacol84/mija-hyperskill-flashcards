import java.math.BigInteger

fun main() {
    val (a, b) = Array(2) { readLine()!!.toBigInteger() }
    val sum = a + b
    val divA = a.multiply(BigInteger.valueOf(100L)).divide(sum)
    val divB = b.multiply(BigInteger.valueOf(100L)).divide(sum)
    println("$divA% $divB%")
}