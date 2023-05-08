package base

import java.io.File

fun main(args: Array<String>) {
    val data = File("data/names.txt").readLines().map {
        it.split(',')
    }

    println(data)

    val names = data.map { (name, _) ->
        name
    }
    val langs = data.map { (_, lang) ->
        lang
    }

    println(names)
    println(langs)
}