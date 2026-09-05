fun filterNumbers(vararg numbers: Int): List<Int> {
    return numbers.filter{it>10}
}

fun main() {
    println(filterNumbers(5, 12, 8, 20, 15, 3))
}