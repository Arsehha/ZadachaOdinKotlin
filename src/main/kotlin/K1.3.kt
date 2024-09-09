fun main() {
   print("Введите число: ")
   val input = readln().toIntOrNull() ?: return
   println("Результат: ${input.toString(2)}")
}