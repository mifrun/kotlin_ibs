fun main(args: Array<String>) {
//    task_one()
//    task_two()
    task_three()
//    task_four()
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

fun task_three() {
//    Задание №3
    var five: Char = '5'
    println(five.toString())
    println(five.toString().toByte())
    println(five.toString().toShort())
    println(five.toString().toInt())
    println(five.toString().toDouble())
    println(five.toString().toFloat())
    println(five.toString().toLong())
}

fun task_four() {
//    Задание №4
    println("Введите ваше имя:")
    var your_name = readLine()
    println("Привет, $your_name")
}