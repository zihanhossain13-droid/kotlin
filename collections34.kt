fun getFirstNumber(numbers: List<Int>): Int? {
    return numbers.firstOrNull()
}
fun main(){
    val numbers = emptyList<Int>()
    val result=getFirstNumber(numbers)
    println(result)
}