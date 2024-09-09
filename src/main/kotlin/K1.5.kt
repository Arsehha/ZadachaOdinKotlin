import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("Введите число n >>> ")
    val n = readln().toIntOrNull()
    print("Введите основание степени x >>> ")
    val x = readln().toDoubleOrNull()
    if (n == null || x == null) {
        println("Неправильный ввод")
    }
    for (i in (-sqrt(n!!.toDouble()).toInt() - 1)..(sqrt(n.toDouble()).toInt() + 1)) {
        val result = x!!.pow(i)
        if (result == n!!.toDouble()) {
            println("Целочисленный показатель существует: $i")
            return
        }
    }
    println("Целочисленный показатель не существует")
}