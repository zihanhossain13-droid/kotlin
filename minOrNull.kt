fun minOrnull(numbers: List<Int>): Int? {
    return numbers.minOrNull()
}
fun main(){
val numbers = listOf(10, 20, 30, 40, 50)
val result=minOrnull(numbers)
println(result)
}