fun main(args: Array<String>) {
    val name1: String? = getName("test")
    println(name1)

    val person = Person("Idel")
    val profession1 = person.profession
    println(profession1)

    println("// проверка на null")

    val name2: String = getName("test") ?: "default"
    println(name2)

    val profession2 = person.profession ?: "default"
    println(profession2)

    getName("test")?.let {
        println(it)
    }

    person?.profession?.let { println(it) }

    println("// безопасный вызов для присваивания")

    var person2: Person? = null
    person2?.profession = "Kotlin-программист"
    person2?.let { println(it.profession) }

    person2 = Person("Иҙел")
    person2?.profession = "Kotlin-программист"
    person2?.let { println(it.profession) }
}

fun getName(lang: String): String? {
    return when (lang) {
        "ru" -> "Идель"
        "en" -> "Idel"
        "ba" -> "Иҙел"
        else -> null
    }
}

class Person(val name: String) {
    var profession: String? = null
}