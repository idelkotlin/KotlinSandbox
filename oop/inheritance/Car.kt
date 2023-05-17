package oop.inheritance

final class Car(
    name: String,
    model: String,
    price: Int,
    var passengerCapacity: Int
) : Vehicle(
    name,
    model,
    price
) {
    override fun showInfo() {
        println("$name, $model, $price, $passengerCapacity, $licensePlate")
    }

    override var licensePlate: String = ""
}