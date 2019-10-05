package Task_18

fun main(args: Array<String>){

    val air2 = Aircraft(2, 4500, 20000)
    println(air2.info)

}

class Aircraft(var number: Int, var ange: Int, var fuel: Int){
    private val expense: Int // расход топлива на 100 км
        get(){
            return fuel/ange*100
        }
    val info: String
        get() = "Самолет $number: \nМаксимальная дальность полета: ${ange}км \nВместимость бака: ${fuel}л \nРасход топлива: ${expense}л на 100км"
}