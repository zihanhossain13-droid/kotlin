fun sortNumbers(numbers: List<Int>): List<Int> {
    return numbers.sorted()
}
fun main(){
  val numbers = listOf(30, 10, 50, 20, 40)
  val result=sortNumbers(numbers)
  println(result)
}