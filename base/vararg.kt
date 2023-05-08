package base

fun main(args: Array<String>) {
    printNames("Идель")
    printNames("Иҙел", "Idel")
}

private fun printNames(vararg names: String) {
    println("Количество выводимых имен: ${names.size}")
    names.forEach {
        println(it)
    }
}