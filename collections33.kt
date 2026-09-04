fun getFirstNumber(numbers: List<Int>): Int {
    return numbers.first()
}
fun main(){
    val numbers = listOf(5, 10, 15, 20, 25)
    val result=getFirstNumber(numbers)
    println(result)
}