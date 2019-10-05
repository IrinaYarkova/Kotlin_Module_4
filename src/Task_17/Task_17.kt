package Task_17

fun main(args: Array<String>){

    val air2: Aircraft = Aircraft()
    air2.number = 2
    air2.ange = 4500
    air2.fuel = 30000
    air2.expense

    println(air2.info)

}

class Aircraft{
    var number: Int = 1 //номер воздушного судна
    var ange: Int = 5000//максимальная дальность полета в км
    var fuel: Int = 20000// вместимость бака
    val expense: Int // расход топлива на 100 км
    get(){
        return fuel/ange*100
    }
    val info: String
        get() = "Самолет $number: \nМаксимальная дальность полета: ${ange}км \nВместимость бака: ${fuel}л \nРасход топлива: ${expense}л на 100км"
}