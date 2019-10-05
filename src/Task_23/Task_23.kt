package Task_23

fun main(args: Array<String>) {

    val bmw = Car("BMW", "red", 256)
    println(bmw.toString())
    val mers = Car("Mersedes", "black", 558)
    println(mers.toString())

}

data class Car(val model: String, val color: String ,val number: Int){
    override fun toString(): String {
        return "Model: $model,  Color: $color, Number: $number"

    }
}