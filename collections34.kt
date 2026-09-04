fun getLastNumber(numbers: List<Int>): Int? {
    return numbers.lastOrNull()
}
fun main(){
    val numbers = emptyList<Int>()
    val result=getLastNumber(numbers)
    println(result)
}