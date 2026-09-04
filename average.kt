fun getAverage(numbers: List<Int>): Double {
    return numbers.average()
}
fun main(){
val numbers = listOf(10, 20, 30, 40, 50)
val result=getAverage(numbers)
println(result)
}