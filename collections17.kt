fun countEvenNumbers(numbers: List<Int>): Int {
    return numbers.count{it%2==0}
}
fun main(){
  val numbers = listOf(5, 10, 15, 20, 25, 30)
  val result=countEvenNumbers(numbers)
  println(result)

}