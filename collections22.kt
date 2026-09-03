fun sortDescending(numbers: List<Int>): List<Int> {
    return numbers.sortedDescending()
}
fun main(){
  val numbers = listOf(30, 10, 50, 20, 40)
  val result=sortDescending(numbers)
  println(result)
}