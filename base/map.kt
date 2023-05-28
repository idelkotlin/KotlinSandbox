package base

import java.io.File

fun main(args: Array<String>) {
    val names = mutableMapOf<String, String>(
        "Русский" to "Идель",
        "Английский" to "Idel"
    )

    names.put("Башҡортса", "Иҙел")

    println("// добавление несколько значений")
    names.putAll(mapOf("Український" to "Ідель", "Esperanto" to "Idelo"))

    println(names.keys)
    println(names.values)
    println(names.entries)
    println(names.toList())

    println("// удаление по ключу \"Русский\"")
    names.remove("Русский")
    println("// удаление по ключу и значению (\"Башҡортса\", \"Иҙел\")")
    names.remove("Башҡортса", "Иҙел")

    if (names.containsKey("Башҡортса")) {
        println(names.getValue("Башҡортса"))
    }

    // без проверки getValue выбрасывает исключение при отсутствии ключа
    if (names.containsKey("Башҡортса1")) {
        println(names.getValue("Башҡортса1"))
    }

    if (names.containsValue("Idel")) {
        println("Idel существует в словаре")
    }

    println(names.getOrDefault("Иҙел", "Без понятий"))

    println("// forEach")
    names.forEach { lang, name -> println("$lang -> $name") }

    println("// for")
    for ((lang, name) in names) {
        println("$lang -> $name")
    }

    println("// чтение данных из файла")
    val namesFromFile = File("data/names.txt")
        .readLines()

    val nameMap: Map<String, String> = List(namesFromFile.size) { index ->
        val (name, lang) = namesFromFile[index].split(',')
        // Pair(lang, name)
        lang to name
    }.toMap()

    println(nameMap)
}