package Task_24

fun main(args: Array<String>){

    val air1 = Boeing747(158, 4000, 18000, 200)
    val air2 = Boeing110(236, 2500, 10000)
    val air3 = Boeing747(347, 5000, 30000, 500)
    val air4 = Boeing020(485, 3000, 15000, 1000)
    var airs: List<Aircraft> = listOf(air1, air2, air3, air4)
    var i = 1

    println("----- Информация о самолетах -----")
    while (i > 0) {
        println("\nМеню\n" +
                "1 - Посмотреть список самолетов\n" +
                "2 - Выход из программы"
        )
        var input: String? = readLine()

        when (input) {
            "1" -> {
                println("Список самолетов: ")
                for (air in airs) {
                    println("------------------------------------------")
                    air.display()
                }
            }
            "2" -> i = 0
            else -> println("Неизвестная команда!")
        }
    }
}

abstract class Aircraft(protected var number: Int, protected var ange: Int, protected var fuel: Int) {
    protected val expense: Int // расход топлива на 100 км
        get() {
            return fuel / ange * 100
        }

    abstract fun display()
}

//учебный самолет
class Boeing110(number: Int, ange: Int, fuel: Int): Aircraft(number, ange,fuel) {

    override fun display() {
        println(
            "Самолет №$number \nМаксимальная дальность полета: ${ange}км \nВместимость бака: ${fuel}л " +
                    "\nРасход топлива: ${expense}л на 100км"
        )
    }
}

//пассажирский самолет
class Boeing747(number: Int, ange: Int, fuel: Int, override val capacityPassenger: Int): Aircraft(number, ange,fuel), Passenger {
    override fun display() {
        println("Самолет №$number \nМаксимальная дальность полета: ${ange}км \nВместимость бака: ${fuel}л " +
                "\nРасход топлива: ${expense}л на 100км, \nВместимость пассажиров: $capacityPassenger человек")
    }
}

//грузовой самолет
class Boeing020(number: Int, ange: Int, fuel: Int, override val capacityCarrying: Int): Aircraft(number, ange,fuel), Cargo {
    override fun display() {
        println("Самолет №$number \nМаксимальная дальность полета: ${ange}км \nВместимость бака: ${fuel}л " +
                "\nРасход топлива: ${expense}л на 100км, \nГрузоподъемность: ${capacityCarrying}тонн")
    }
}

interface Passenger{
    val capacityPassenger: Int
}

interface Cargo{
    val capacityCarrying: Int
}