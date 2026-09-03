fun areAllGreaterThanFive(numbers: List<Int>): Boolean {
    return numbers.all{
      it>5
    }
}
fun main(){
  val numbers = listOf(5, 10, 15, 20, 25)
  val result=areAllGreaterThanFive(numbers)
  println(result)
}