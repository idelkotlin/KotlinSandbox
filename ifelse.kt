fun main(args: Array<String>) {
    val name = "Иҙел"

    // I вариант
    if (name == "Идель") {
        println("Русский")
    } else if (name == "Idel") {
        println("Английский")
    } else if (name == "Иҙел") {
        println("Башҡортса")
    } else {
        println("Без понятий")
    }

    // II вариант
    val lang = if (name == "Идель") {
        "Русский"
    } else if (name == "Idel") {
        "Английский"
    } else if (name == "Иҙел") {
        "Башҡортса"
    } else {
        "Без понятий"
    }

    println(lang)
}