package oop

import java.io.File

fun main(args: Array<String>) {
    val logger = LoggerV2.getInstance("data/log.txt")
    println(logger.all())
    println(logger.last())
    logger.add("Новая строка")
    println(logger.all())
}

class LoggerV2(val filename: String) {
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

    companion object {
        fun getInstance(filename: String) = LoggerV2(filename)
    }
}