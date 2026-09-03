fun getEvenNumbers(numbers: List<Int>): List<Int> {
    return numbers.filter{it%2==0}
}
fun main(){
  val numbers = listOf(5, 10, 15, 20, 25, 30)
  val result=getEvenNumbers(numbers)
  println(result)
}