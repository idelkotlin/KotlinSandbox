fun main(args: Array<String>) {
    val digits = listOf<Int>(1,2,3,4,5,6,7,8,9)


    println(digits.map {
        getDivisors(digits, it)
    })

    println(digits.flatMap {
        getDivisors(digits, it)
    })
}

private fun getDivisors(list: List<Int>, d: Int): List<Int> {
    return list.filter {
        it % d == 0
    }
}