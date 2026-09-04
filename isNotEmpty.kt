fun hasNumber(numbers: List<Int>): Boolean {
    return numbers.isNotEmpty()
}
fun main(){
    val numbers = listOf(10, 20, 30, 40, 50)
    val result=hasNumber(numbers)
    println(result)
}