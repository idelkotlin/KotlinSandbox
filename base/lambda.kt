package base

fun main(args: Array<String>) {
    // I вариант
    val getLang1: (String) -> String = { name ->
        when (name) {
            "Идель" -> "Русский"
            "Idel" -> "Английский"
            "Иҙел" -> "Башҡортса"
            else -> "Без понятий"
        }
    }

    println(getLang1("Идель"))


    // II вариант
    val getLang2: (String) -> String = {
        when (it) {
            "Идель" -> "Русский"
            "Idel" -> "Английский"
            "Иҙел" -> "Башҡортса"
            else -> "Без понятий"
        }
    }

    println(getLang2("Idel"))

    // III вариант
    val getLang3 = { name: String ->
        when (name) {
            "Идель" -> "Русский"
            "Idel" -> "Английский"
            "Иҙел" -> "Башҡортса"
            else -> "Без понятий"
        }
    }

    println(getLang3("Иҙел"))

    println("// передача лямда-выражения в функцию")
    val names = listOf("Idel", "Иҙел", "Esperanto")
    printCollection(names) {
        getLang1(it)
    }
}


fun printCollection(list: List<String>, f: (String) -> String) {
    list.forEach {
        println("$it -> ${f(it)}")
    }
}