fun getTotal(numbers: List<Int>): Int {
    return numbers.fold(0){total,numbers->total+numbers}
}
fun main(){
val numbers = listOf(10, 20, 30, 40)
val result=getTotal(numbers)
println(result)
}