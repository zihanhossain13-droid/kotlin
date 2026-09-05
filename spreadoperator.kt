fun total(vararg numbers: Int): Int {
    var sum = 0

    for (number in numbers) {
        sum += number
    }

    return sum
}

fun main() {
    val numbers = intArrayOf(10, 20, 30, 40)

    println(total(*numbers))
}