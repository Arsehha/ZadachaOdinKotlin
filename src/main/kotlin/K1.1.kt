fun main() {
    println("Введите строку")
    val input = readln()
    //val input = "AAADSSSRRTTHAAAA"
    var rresult = ""
    var count = 1
    var lastChar = input[0]

    for(i in 1 .. input.length-1) {
        if (lastChar==input[i]) {
            count++
        }
        else {
            if (count == 1) {
                rresult += lastChar
            } else {
                rresult += lastChar + count.toString()
            }
            count = 1
            lastChar = input[i]
        }
    }
    if (count==1) {
        rresult+=lastChar
    }
    else {
        rresult += lastChar + count.toString()
    }
    println("Результат $rresult")
}