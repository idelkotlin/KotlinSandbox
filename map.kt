import java.io.File

fun main(args: Array<String>) {
    val names = mutableMapOf<String, String>(
        "Русский" to "Идель",
        "Английский" to "Idel",
        "Башҡортса" to "Иҙел"
    )

    println(names.getValue("Башҡортса"))
    println(names.getOrDefault("Иҙел", "Без понятий"))

    names.forEach { lang, name -> println("$lang -> $name") }

    /**
     * Преобразование списка в массив
     */
    val namesFromFile = File("data/names.txt")
        .readLines()

    val nameMap: Map<String, String> = List(namesFromFile.size) { index ->
        val (name, lang) = namesFromFile[index].split(',')
        // Pair(lang, name)
        lang to name
    }.toMap()

    println(nameMap)
}