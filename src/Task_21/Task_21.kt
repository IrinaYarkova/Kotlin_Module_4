package Task_21

fun main(args: Array<String>){

    val air2 = Boeing747(2, 4500, 20000, 500)
    air2.display()

    val air3 = Boeing747(3, 3000, 18000, 200)
    air3.display()
}

abstract class Aircraft(var number: Int, var ange: Int, var fuel: Int) {
    val expense: Int
        get() {
            return fuel / ange * 100
        }
    abstract fun display()
}

class Boeing747(number: Int, ange: Int, fuel: Int, override val capacity: Int): Aircraft(number, ange,fuel), Passenger {

    override fun display() {
        println("Самолет $number: \nМаксимальная дальность полета: ${ange}км \nВместимость бака: ${fuel}л " +
                "\nРасход топлива: ${expense}л на 100км, \nВместимость пассажиров: $capacity человек")
    }
}

interface Passenger{
    val capacity: Int
}