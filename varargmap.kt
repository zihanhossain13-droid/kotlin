fun squareNumbers(vararg numbers: Int): List<Int> {
    return numbers.map{
      it*it
    }
}

fun main() {
    println(squareNumbers(2, 3, 4, 5))
}