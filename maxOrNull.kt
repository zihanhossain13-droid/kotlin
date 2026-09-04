fun maxOrnull(numbers: List<Int>): Int? {
    return numbers.maxOrNull()
}
fun main(){
val numbers = listOf(10, 20, 30, 40, 50)
val result=maxOrnull(numbers)
println(result)
}