package oop

fun main(args: Array<String>) {
    println("// создание объекта при помощи главного конструктора")
    val carV41 = CarV4("Tesla", "Model S", 90000)
    println("${carV41.name}, ${carV41.model}, ${carV41.price}")

    println("// создание объекта при помощи дополнительного конструктора")
    val carV42 = CarV4("Tesla", "Model Y")
    println("${carV42.name}, ${carV42.model}, ${carV42.price}")
}


/**
 * Порядок инициализации класса
 * 1. главный конструктор
 * 2. зависит от порядка расположения (init или инициализация при объявлении в классе)
 * 3. дополнительный конструктор
 */
class CarV4(
    var name: String,
    model: String,
    price: Int
) {
    var model: String = model
        set (value) {
            field = value.uppercase()
            println("model.uppercase()")
        }

    var price: Int = price

    constructor(
        name: String,
        model: String
    ) : this( // тут именованные аргументы
        name = name,
        model = model,
        price = 50000
    ) {
        this.price = 40000
        // в этом случае только срабатывает set()
        this.model = model
        println("Дополнительный конструктор: price = $price")
    }

    init {
        this.price = 70000
        println("Блок инициализации: price = $price")
    }
}