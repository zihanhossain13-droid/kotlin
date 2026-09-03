fun areAllEven(numbers: List<Int>): Boolean {
    return numbers.all{
      it%2==0
    }
}
fun main(){
  val numbers = listOf(2, 4, 6, 8, 10)
  val result=areAllEven(numbers)
  println(result)
}