package oop

fun main(args: Array<String>) {
    val rectangle = object: RectangleV2("Прямоугольник", 2, 3), AreaV2 {
        override fun getArea(): Double {
            return (width*height).toDouble()
        }
    }

    rectangle.printTitle()

    println("Площадь прямоугольника: ${rectangle.getArea()}")
}

open class RectangleV2(
    val title: String,
    var width: Int,
    var height: Int
) {
    fun printTitle() {
        println(title)
    }
}

interface AreaV2 {
    fun getArea(): Double
}