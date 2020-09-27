fun main() {
    val a = arrayOf(9, 8, 3, 1, 5, 4)

    for (i in a.indices) {
        if (a[i] % 2 == 0) {
            a[i] += 1
        } else {
            a[i] -= 1
        }
    }
    println(a.joinToString { ", " })

}