package base

fun main(args: Array<String>) {
    var name = "Izel"

    // I проверка null
    var lang = getLang(name)
    if (lang != null) {
        println("Язык на котором написано ваше имя: ${lang.uppercase()}")
    }

    // II вариант
    lang = getLang(name)?.uppercase()
    if (lang != null) {
        println("Язык на котором написано ваше имя: $lang")
    }

    // III вариант
    name = "Idel"
    var message = getLang(name)?.uppercase()?.let {
        "Язык на котором написано ваше имя: $it"
    }
    if (message != null) {
        println(message)
    }

    // IV вариант
    name = "Izel"
    message = getLang(name)?.uppercase()?.let {
        "Язык на котором написано ваше имя: $it"
    } ?: "Язык на котором написано ваше имя: без понятий"
    println(message)
}

private fun getLang(name: String): String? {
    return when (name) {
        "Идель" -> "Русский"
        "Idel" -> "Английский"
        "Иҙел" -> "Башҡортса"
        else -> null
    }
}