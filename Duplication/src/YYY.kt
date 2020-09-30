var counter = 6
fun main() {
    if(counter == 0) return
    counter = counter - 1
    main(counter)
//    main()
}

fun main(args: Int) {
    print(args)

    try {
        // code that may throw an exception
    }
    catch (e: RuntimeException) {
        // ...
    }
    catch (e: Exception) {
        // ...
    }

    try {
        // code that may throw an exception
    }
    catch (e: Exception) {
        // ...
    }
    catch (e: RuntimeException) {
        // ...
    }

    try {
        // code that may throw an exception
    }
    catch (Exception) {
        // ...
    }
    catch (RuntimeException) {
        // ...
    }

    try {
        // code that may throw an exception
    }
    catch 1: (e: ArithmeticException) {
        // ...
    }
    catch 2: (e: RuntimeException) {
        // ...
    }
    catch 3: (e: Exception) {
        // ...
    }
}