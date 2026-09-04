fun getUniqueNumbers(numbers: List<Int>): List<Int> {
    return numbers.distinct()
}
fun main(){
    val numbers = listOf(
    10, 20, 10, 30, 20, 40, 30, 50
)
val result=getUniqueNumbers(numbers)
println(result)
}