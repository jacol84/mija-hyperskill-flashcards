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

    var a = arrayOf(3, 0, 3, 9, 2, 1)
    calculations1(a)
    calculations2(a)
    calculations3(a)
}

fun calculations3(a: Array<Int>) {
    var r = 0
    for (i in a.indices) {
        if (a[i] < a.size) {
            r += a[i]
        }
    }
    println(r)
}

fun calculations2(a: Array<Int>) {
    var r = 13
    r += a[a[0]]
    r -= a[a[a.size-1]]
    println(r)
}

fun calculations1(a: Array<Int>){
    var r = 7
    for (i in a.indices) {
        r += a[i] * a[i]
    }
    println(r)
}

