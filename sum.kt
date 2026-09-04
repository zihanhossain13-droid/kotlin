fun hasNumber(numbers: List<Int>): Int {
    return numbers.sum()
}
fun main(){
    val numbers = listOf(10, 20, 30, 40, 50)
    val result=hasNumber(numbers)
    println(result)
}