package oop.inheritance

final class Truck(
    name: String,
    model: String,
    price: Int,
    var loadCapacity: Int
): Vehicle(
    name,
    model,
    price
) {
    override fun showInfo() {
        println("$name, $model, $price, $loadCapacity, $licensePlate")
    }

    override var licensePlate: String = ""
}