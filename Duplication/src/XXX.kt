fun xxx() {
    val a = arrayOf(9, 8, 3, 1, 5, 4)

    for (i in a.indices) {
        if (a[i] % 2 == 0) {
            a[i] += 1
        } else {
            a[i] -= 1
        }
    }
    println(a.joinToString(separator = " "))

}

fun xxx2() {
    val a = arrayOf(3, 5, 2, 1)
    var x = 10
    a[0] -= x
    a[1] += x
    x -= a[2]
    a[2] = x
    a[3] -= x

    println(a.joinToString(separator = " "))

}


fun main() {
    xxx()
    xxx2()
}

