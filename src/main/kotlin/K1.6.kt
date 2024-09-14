/*Создать приложение, в котором пользователь вводит две различных цифры.
На выходе приложение выдает, если это возможно, из введенных цифр, нечетное число.
Результат выводится в консоль. При невозможности создать нечетное число выводится
сообщение – «Создать нечетное число невозможно». Каждое число вводится на отдельной строке*/


fun main() {
    print("Введите первую цифру: ")
    val first = readln()
    if (first.length != 1 || first.toIntOrNull() == null) {
        println("Неверный ввод")
        return
    }
    print("Введите вторую цифру: ")
    val second = readln()
    if (second.length != 1 || second.toIntOrNull() == null) {
        println("Неверный ввод")
        return
    }

    print("Результат: ")
    if (first.toInt() % 2 == 1) {
        println("$second$first")
    } else if (second.toInt() % 2 == 1) {
        println("$first$second")
    }
    else {
        println("Не получается составить нечётное число")
    }
}