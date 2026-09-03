fun getEvenNumbers(numbers: List<Int>): List<Int> {
    return numbers.filter{it>10}
}
fun main(){
  val numbers = listOf(5, 12, 8, 20, 15, 3, 25)
  val result=getEvenNumbers(numbers)
  println(result)
}