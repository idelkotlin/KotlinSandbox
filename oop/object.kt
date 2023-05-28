package oop;

import java.io.File

fun main(args: Array<String>) {
    Logger.add("Тестирование логгера")
    Logger.all().forEach {
        println(it)
    }
    Logger.add("Вторая строка")
    println("Последняя строка: ${Logger.last()}")
}

// Работа с файлом лога
object Logger {
    // файл лога
    val filename: String = "data/log.txt"

    fun add(text: String) {
        File(filename).appendText(text+System.lineSeparator())
    }

    fun all(): List<String> {
        val lines = File(filename).readLines()
        if (lines.isNotEmpty()) {
            return lines
        }

        return listOf()
    }

    fun last(): String {
        val lines = File(filename).readLines()
        if (lines.isNotEmpty()) {
            return lines.last()
        }

        return "Лог пуст"
    }
}