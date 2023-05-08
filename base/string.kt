package base

fun main(args: Array<String>) {
    val name = "Иҙел"
    // I вариант
    println(name + " -> " + getLang(name))

    // II вариант
    println("$name -> ${getLang(name)}")

    // III
    println("""
        $name -> ${getLang(name)}
        """.trimIndent()
    )
}

private fun getLang(name: String): String {
    return when (name) {
        "Идель" -> "Русский"
        "Idel" -> "Английский"
        "Иҙел" -> "Башҡортса"
        else -> "Без понятий"
    }
}