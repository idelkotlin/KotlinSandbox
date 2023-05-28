package base

fun main(args: Array<String>) {
    // массив
    val a1 = arrayOf(0,1,2,3,4,5,6,7,8,9)
    // массив с элементами null
    val a2: Array<Int?> = arrayOfNulls(size = 10)
    // явное определение массива из чисел
    val a3 = intArrayOf(0,1,2,3,4,5,6,7,8,9)

    println("// вывод массива for-ом")
    for (item in a1) {
        print(item)
    }
    println()
    for (index in 0..9) {
        print(a1[index])
    }

    println("\n// вывод массива forEach")
    a1.forEach { print(it) }
    println()
    a1.reverse()
    a1.forEachIndexed { index, item ->
        println("$index => $item")
    }
}