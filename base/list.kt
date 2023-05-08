package base

fun main(args: Array<String>) {
    // I вариант
    val names1: List<String>
    names1 = listOf<String>("Идель", "Idel", "Иҙел")
    // II вариант
    val names2 = listOf<String>("Идель", "Idel", "Иҙел")

    println("// обращение к элементам")
    println(names1.get(1))
    println(names2[2])
    println(names1.first())
    println(names2.last())

    println("// безопасное обращение к элементам")
    println(names1.getOrElse(99, { "Нет элемента" }))
    println(names1.getOrElse(99) { "Нет элемента" })
    println(names2.getOrNull(99).let { it })
    println(names2.getOrNull(99) ?: "Нет элемента")

    println("// проверка существования элемента")
    println(names1.contains("Идель"))
    println(names1.containsAll(listOf("Идель", "Idel")))

    println("// изменияющийся список")
    val names3 = names1.toMutableList()
    names3.add(0, "Иҙел")
    println(names3)

    println("// перебор элементов")
    for (name in names3) {
        println(name)
    }
    for (i in names3.size-1 downTo 0 step 2) {
        println(names3[i])
    }
    names3.forEach {
        println(it)
    }
    names3.forEachIndexed { index, name ->
        println("${index+1} => $name")
    }
}