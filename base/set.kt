package base

fun main(args: Array<String>) {
    val names = mutableListOf<String>("Идель", "Idel", "Иҙел", "Идель", "Idel")
    names.addAll(setOf("Izel", "Иҙел"))

    println("// список имен")
    for (name in names) {
        println(name)
    }

    println("// удаление имен: \"Idel\", \"Izel\"")
    names -= listOf("Idel", "Izel")
    names.forEach {
        println(it)
    }

    val newNames = names.toSet()

    println("// удаление всех элементов")
    while (names.size > 0) {
        val name = names.elementAt(0)
        names.remove(name)
        println(name)
    }

    println("// копия newNames")
    newNames.forEach {
        println(it)
    }
}