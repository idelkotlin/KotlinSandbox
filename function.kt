fun main(args: Array<String>) {
    println(getLangV1("Иҙел"))
    println(getLangV2("Idel"))
}

fun getLangV1(name: String): String {
    return when (name) {
        "Идель" -> "Русский"
        "Idel" -> "Английский"
        "Иҙел" -> "Башҡортса"
        else -> "Без понятий"
    }
}

fun getLangV2(name: String) = when (name) {
    "Идель" -> "Русский"
    "Idel" -> "Английский"
    "Иҙел" -> "Башҡортса"
    else -> "Без понятий"
}
