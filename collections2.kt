fun getEvenNumbers(numbers: List<Int>): List<Int> {
    return numbers.filter{it>0}
}
fun main(){
  val numbers = listOf(-5, 10, -2, 20, 0, 15, -8)
  val result=getEvenNumbers(numbers)
  println(result)
}