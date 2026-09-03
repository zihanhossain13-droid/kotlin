fun getEvenNumbers(numbers: List<Int>): List<Int> {
    return numbers.map{it*2}
}
fun main(){
  val numbers = listOf(2, 4, 6, 8, 10)
  val result=getEvenNumbers(numbers)
  println(result)
}