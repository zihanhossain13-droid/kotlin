fun showNumbers(name: String, vararg numbers: Int): String {
    var sum = 0

    for (number in numbers) {
        sum += number
    }

    return "$name: $sum"
}

fun main() {
    val numbers = intArrayOf(10, 20, 30)

    println(showNumbers("Zihan",*numbers))
}