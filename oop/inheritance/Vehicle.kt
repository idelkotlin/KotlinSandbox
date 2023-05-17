package oop.inheritance

abstract class Vehicle(
    protected val name: String,
    model: String,
    price: Int
) {
    protected var model = model
        set (value) {
            field = value.uppercase()
        }

    protected var price = price
        get() = 75*field

    abstract var licensePlate: String


    open fun showInfo() {
        println("$name, $model, $price")
    }
}