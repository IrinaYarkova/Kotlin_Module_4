package Task_22

fun main(args: Array<String>){

    val air2 = Aircraft(2, 4500, 20000)
    air2.display()

    val air3 = Boeing747(3, 3000, 18000, 200)
    air3.display()
}

open class Aircraft(protected var number: Int, protected var ange: Int, protected var fuel: Int) {
    protected val expense: Int // расход топлива на 100 км
        get() {
            return fuel / ange * 100
        }

    open fun display(){
        println("Самолет $number: \nМаксимальная дальность полета: ${ange}км \nВместимость бака: ${fuel}л " +
                "\nРасход топлива: ${expense}л на 100км")
    }
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