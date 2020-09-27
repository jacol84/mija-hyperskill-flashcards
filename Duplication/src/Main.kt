// Write your code here. Do not import any libraries
val myFile = File("MyFile.txt").also { it.appendText(it.readText()) }