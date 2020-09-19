fun main() {
    val words = mutableMapOf<String, Int>()
    var text = readLine()!!
    while (text != "stop") {
        words[text] = words.getOrPut(text, { 0 }) + 1
        text = readLine()!!
    }
    val pair = words.toList().maxBy { it.second }
    print(pair?.first ?: "null")
}