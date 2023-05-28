package base

import kotlin.Exception

fun main(args: Array<String>) {
    try {
        println(getLang("Иҙел1"))
    } catch (e: Exception) {
        println(e.message)
    } finally {
        println("Выполняется всегда")
    }

    println(try { "4.2".toInt() } catch (e: Exception) { null })
}

private fun getLang(name: String): String {
    return when(name) {
        "Идель" -> "Русский"
        "Idel" -> "Английский"
        "Иҙел" -> "Башҡортса"
        else -> throw IllegalArgumentException("Errors")
    }
}