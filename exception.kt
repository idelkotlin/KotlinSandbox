import java.lang.Exception

fun main(args: Array<String>) {
    try {
        println(getLang("Иҙел1"))
    } catch (e: Exception) {
        println(e.message)
    }
}

private fun getLang(name: String): String {
    return when(name) {
        "Идель" -> "Русский"
        "Idel" -> "Английский"
        "Иҙел" -> "Башҡортса"
        else -> throw IllegalArgumentException("Errors")
    }
}