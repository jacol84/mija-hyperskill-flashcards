val a = arrayOf(4, 0, 9, 2, 1)
val b = arrayOf(6, 3, 2, 9, 0)

fun main() {
    for (i in a.indices) {
        if (i % 2 == 0)
            a[i] -= b[i]
        else
            b[i] -= a[i]
    }
    println(a.joinToString(separator = " "))
    println(b.joinToString(separator = " "))
}