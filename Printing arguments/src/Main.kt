fun main(args: Array<String>) = if (args.size == 3) {
    args.mapIndexed { i, it -> "Argument ${i + 1}: $it. It has ${it.length} characters" }.joinToString("\n")
} else {
    "Invalid number of program arguments"
}.let { println(it) }