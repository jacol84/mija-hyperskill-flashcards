fun solution(products: List<String>, product: String) {
    val position = products.mapIndexed { index, s -> s to index }.filter { it.first == product }.map { it.second }.joinToString(" ")
    println(position)
}