package oop.inheritance

fun main(args: Array<String>) {
    val teslaModelS = Car(name = "Tesla", model = "Model S", price = 85000, passengerCapacity = 5)
    teslaModelS.licensePlate = "California 123 ABC"
    teslaModelS.showInfo()

    val teslaSemi = Truck(name = "Tesla", model = "Semi", price = 150000, loadCapacity = 36)
    teslaSemi.showInfo()

    println("// проверка принадлежности")
    val cars = arrayOf(teslaSemi, teslaModelS)
    for (item in cars) {
        if (item is Car) {
            println("Вместимость машины: ${item.passengerCapacity}")
        }
    }


    println("// when is")
    for (item in cars) {
        when (item) {
            is Car -> {
                println("Вместимость машины: ${item.passengerCapacity}")
            }
            is Truck -> {
                println("Грузоподъемность: ${item.loadCapacity}")
            }
        }
    }
}