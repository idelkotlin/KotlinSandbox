import java.io.File

fun main(args: Array<String>) {
    val lines = File("data/names.txt").readLines();

    // сохранение в список
    val nameList: List<String> = lines.map {
        val (name, _) = it.split(',')
        name
    }

    println(nameList)

    // сохранение в асоциативный массив
    // I вариант
    val nameMap: Map<String, String> = lines.map {
        val (name, lang) = it.split(',')
        lang to name
    }.toMap()

    println(nameMap)

    // II вариант
    val nameMap2 = lines.associate {
        val (name, lang) = it.split(',')
        // lang to name
        Pair(lang, name)
    }

    println(nameMap2)
}