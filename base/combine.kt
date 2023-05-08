package base

fun main(args: Array<String>) {
    val numbers = listOf<Int>(0,1,2,3,4,5,6,7,8,9,10)
    println(numbers.filter {
        it % 2 == 0
    })
    println(numbers.filter {
        it % 2 != 0
    })

    println(numbers.filter {
        it % 2 == 0
    }.zip(numbers.filter {
        it % 2 != 0
    }) { n1: Int, n2: Int ->
        "счетный: $n1, не счетный: $n2"
    })
}