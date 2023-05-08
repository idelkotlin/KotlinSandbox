package base

fun main(args: Array<String>) {
    val name = "Иҙел"

    val lang = when (name) {
        "Идель" -> "Русский"
        "Idel" -> "Английский"
        "Иҙел" -> "Башҡортса"
        else -> "Без понятий"
    }

    println(lang)
}