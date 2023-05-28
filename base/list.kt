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
    if (names1.contains("Idel")) {
        println("Индекс значения Idel = ${names1.indexOf("Idel")}")
    }

    println("// изменияющийся список")
    val names3 = names1.toMutableList()
    names3.add(0, "Иҙел")
    // удаление "Идель"
    names3.remove("Идель")
    // удаление второго элемента
    names3.removeAt(1)
    // замена первого элемента
    names3.set(0, "Idel")
    println(names3)

    println("// перебор элементов")
    for (name in names1) {
        println(name)
    }
    for (i in names1.size-1 downTo 0 step 2) {
        println(names1[i])
    }
    names1.forEach {
        println(it)
    }
    names1.forEachIndexed { index, name ->
        println("${index+1} => $name")
    }
}