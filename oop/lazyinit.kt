package oop

import kotlin.random.Random

/**
 * Отложенная инициализация
 */

fun main(args: Array<String>) {
    val carLazyinit = CarLazyinit("Tesla", "Model S")
    println("${carLazyinit.name}, ${carLazyinit.model}, ${carLazyinit.price}")
    // повторный вызов
    println("${carLazyinit.name}, ${carLazyinit.model}, ${carLazyinit.price}")
}

class CarLazyinit(
    val name: String,
    var model: String
) {
    val price: Int by lazy {
        println("Инициализация цены")
        // задержка на 5 секунд
        Thread.sleep(5000)
        // по идеи значение должен менятся каждый раз при обращении к свойству
        // но повторно этот код не выплняется
        75000 + Random.nextInt(1,1000)
    }
}