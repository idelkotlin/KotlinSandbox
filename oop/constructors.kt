package oop

fun main(args: Array<String>) {
    println("// пустой конструктор")
    val carV0 = CarV0()
    println("${carV0.name}, ${carV0.model}, ${carV0.price}")

    println("// главный конструктор")
    val carV1 = CarV1("Tesla", "Model S", 85000)
    println("${carV1.name}, ${carV1.model}, ${carV1.price}")

    println("// определение свойств в конструкторе")
    val carV2 = CarV1("Tesla", "Model S", 85000)
    println("${carV2.name}, ${carV2.model}, ${carV2.price}")
    carV2.price = 200000
    println("${carV2.name}, ${carV2.model}, ${carV2.price}")

    println("// дополнительный конструктор")
    val carV3 = CarV3(model = "Model S", name = "Tesla") // именованные аргументы
    println("${carV3.name}, ${carV3.model}, ${carV3.price}")
}


/**
 * Пустой конструтор
 */
class CarV0 {
    val name: String = "Tesla"
    var model: String = "Model S"
        set (value) {
            field = value.uppercase()
        }
    var price: Int = 85000
        get () { // конвертация доллары в рубли только при доступе к свойству
            return 75*field
        }
}


/**
 * Главный конструктор
 */
class CarV1(
    name: String,
    model: String,
    price: Int
) {
    val name: String = name
    var model: String = model
        set (value) {
            field = value.uppercase()
        }
    var price: Int = price
        get () { // конвертация доллары в рубли только при доступе к свойству
            return 75*field
        }
}


/**
 * Определение свойств в конструкторе
 */
class CarV2(
    val name: String,
    model: String,
    price: Int
) {
    var model: String = model
        set (value) {
            field = value.uppercase()
        }
    var price: Int = price
        get () {
            return 75*field
        }
}


/**
 * Дополнительный конструктор
 * Аргумент по умолчанию
 * Именованные аргументы в дополнительном конструкторе
 */
class CarV3(
    val name: String,
    model: String,
    price: Int
) {
    var model: String = model
        set (value) {
            field = value.uppercase()
        }

    var price: Int = price
        get () { // конвертация доллары в рубли
            return 75*field
        }

    constructor(
        name: String,
        model: String
    ) : this( // тут именованные аргументы
        name = name,
        model = model,
        price = 50000
    )
}