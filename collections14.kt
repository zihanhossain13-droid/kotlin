fun areAllPositive(numbers: List<Int>): Boolean {
    return numbers.all {
        it>0
    }
}
fun main(){
  val numbers = listOf(5, 10, 15, 20)
  val result=areAllPositive(numbers)
  println(result)
  }