fun main(args: Array<String>) {
    val names = mutableListOf<String>("Идель", "Idel", "Иҙел")
    names.add("Izel")

    names -= listOf("Idel", "Izel")

    while (names.size > 0) {
        val name = names.elementAt(0)
        names.remove(name)
        println(name)
    }
}