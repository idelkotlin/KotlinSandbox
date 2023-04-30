fun main(args: Array<String>) {
    print("Введите имя: ")
    val name = readLine()
    print("Вам сколько лет: ")
    val age = readLine()?.toInt()

    println("Привет $name")
    println("Вам $age лет")
}