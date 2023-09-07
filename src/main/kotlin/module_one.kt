fun main(args: Array<String>) {
    task_one()
    task_two()
    task_three()
}

fun task_one() {
//  Задание №1
    var one: Any? = null
    one = 6
    var three = one / 2.5
    //в переменной "Three" тип Double

}

fun task_two() {
//    Задание №2
    var one = "hello"
    var two = "aplana"
    println("$one $two")
}

fun tasl_three() {
//    Задание №3
    var five: Char = '5'
    println(five.toString())
    println(five.code.toByte())
    println(five.code.toShort())
    println(five.code)
    println(five.code.toDouble())
    println(five.code.toFloat())
    println(five.code.toLong())
}