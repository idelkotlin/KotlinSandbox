package base

fun main(args: Array<String>) {
    val n = 7

    // проверка пренадлежности числа
    if (n in 1..10) {
        println("1 <= n <= 10")
    }
}