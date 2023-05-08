package base

import java.io.File

fun main(args: Array<String>) {
    val lines = File("data\\names.txt")
        .readText()
        .split("\n")

    val names = List(lines.size) { index ->
        val (name, _) = lines[index].split(',')
        name
    }

    println(names)
}