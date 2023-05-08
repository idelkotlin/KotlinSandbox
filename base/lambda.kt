package base

fun main(args: Array<String>) {
    // I вариант
    val getLang1: (String) -> String = { name ->
        when (name) {
            "Идель" -> "Русский"
            "Idel" -> "Английский"
            "Иҙел" -> "Башҡортса"
            else -> "Нет понятий"
        }
    }

    println(getLang1("Идель"))


    // II вариант
    val getLang2: (String) -> String = {
        when (it) {
            "Идель" -> "Русский"
            "Idel" -> "Английский"
            "Иҙел" -> "Башҡортса"
            else -> "Нет понятий"
        }
    }

    println(getLang2("Idel"))

    // III вариант
    val getLang3 = { name: String ->
        when (name) {
            "Идель" -> "Русский"
            "Idel" -> "Английский"
            "Иҙел" -> "Башҡортса"
            else -> "Нет понятий"
        }
    }

    println(getLang3("Иҙел"))
}