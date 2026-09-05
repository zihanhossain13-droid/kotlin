fun processNumbers(vararg numbers: Int): List<Int> {
    return numbers.filter{it%2==0}.map{it*it}
}

fun main() {
    println(processNumbers(2, 5, 4, 7, 6, 3))
}