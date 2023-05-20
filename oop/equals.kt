package oop

fun main(args: Array<String>) {
    println("// обычные объекты")
    val c1 = Car("Tesla", "Model S")
    val c2 = Car("Tesla", "Model Y")
    val c3 = Car("Tesla", "Model S")
    println(c1)
    println(c1.hashCode())
    println(c2)
    println(c2.hashCode())
    println(c3)
    println(c3.hashCode())

    if (c1 == c2) {
        println("c1 == c2")
    }

    if (c1 == c3) {
        println("c1 == c3")
    }

    println("// объекты данных")
    val cd1 = CarData("Tesla", "Model S")
    val cd2 = CarData("Tesla", "Model Y")
    val cd3 = CarData("Tesla", "Model S")
    println(cd1)
    println(cd1.hashCode())
    println(cd2)
    println(cd2.hashCode())
    println(cd3)
    println(cd3.hashCode())

    if (cd1 == cd2) {
        println("cd1 == cd2")
    }

    if (cd1 == cd3) {
        println("cd1 == cd3")
    }

    println("// ссылаются ли переменные на один и тот же объект")
    if (cd1 === cd2) {
        println("cd1 === cd2")
    }

    if (cd1 === cd3) {
        println("cd1 === cd3")
    }
}

class Car(var name: String, var model: String)

data class CarData(val name: String, val model: String)