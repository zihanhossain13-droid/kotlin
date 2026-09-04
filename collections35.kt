fun getLastNumber(numbers: List<Int>): Int {
    return numbers.last()
}
fun main(){
    val numbers = listOf(5, 10, 15, 20, 25)
    val result=getLastNumber(numbers)
    println(result)
}