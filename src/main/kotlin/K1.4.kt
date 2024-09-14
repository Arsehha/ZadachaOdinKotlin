/*Создать приложение, с помощью которого пользователь, введя два числа и символ операции, узнает результат.
Символами операции могут быть: / — деление, * — умножение, + — сложение, - — вычитание.
Числа могут быть вещественными. Числа и знак операции разделяются между собой одним пробелом.
Ввод производится в формате - ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ*/

fun main() {
    println("Введите вычисление в формате({число1} {число2} {оператор})")
    val input = readln().split(' ')
    if (input.count() != 3) {
        return
    }
    val first = input[0].toDoubleOrNull()
    val second = input[1].toDoubleOrNull()
    if (first == null || second == null) {
        println("Неверный ввод")
        return
    }
    val operation = input[2]
    print("Результат: ")
    when (operation) {
        "+" -> println(first + second)
        "-" -> println(first - second)
        "/" -> println(first / second)
        "*" -> println(first * second)
        else -> {
            println("Неверный ввод")
            return
        }
    }
}