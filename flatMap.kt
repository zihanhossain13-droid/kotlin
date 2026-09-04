fun  flattenNumber(numbers: List<List<Int>>): List<Int> {
    return numbers.flatMap{it}
}
fun main(){
val numbers = listOf(
    listOf(1, 2),
    listOf(3, 4),
    listOf(5, 6)
)
val result=flattenNumber(numbers)
println(result)
}