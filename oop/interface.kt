package oop

fun main(args: Array<String>) {
    val r1 = Rectangle("Прямоугольник", 10, 5)
    r1.printTitle()

    val c1 = Circle("Круг", 15)
    c1.printTitle()
    println("Площадь круга = ${c1.getArea()}")
}

abstract class GeometricShape(val title: String) {
    fun printTitle() {
        println(this.title)
    }
}

interface Area {
    fun getArea(): Double
}

final class Rectangle(
    title: String,
    var width: Int,
    var height: Int
): GeometricShape(
    title
) {

}

final class Circle(
    title: String,
    var radius: Int
): GeometricShape(title), Area {
    override fun getArea(): Double {
        return Math.PI*radius*radius
    }
}