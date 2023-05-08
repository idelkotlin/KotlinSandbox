package oop

/**
 * Поздняя инициализация
 */

lateinit var carLateinit: CarLateinit

fun main(args: Array<String>) {
    carLateinit = CarLateinit("Tesla", 70000)
    println("${carLateinit.name}, ${carLateinit.price}")

    carLateinit.model = "Model X"
    println("${carLateinit.name}, ${carLateinit.model}, ${carLateinit.price}")
}

class CarLateinit(
    val name: String,
    price: Int
) {
    // но только перед использованием, нужно присвоить значение
    lateinit var model: String
    var price: Int = price
}