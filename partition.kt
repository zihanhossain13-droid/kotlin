fun separateEvenOdd(
    numbers: List<Int>
): Pair<List<Int>, List<Int>> {
    return numbers.partition{it%2==0}
}
fun main(){
  val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
  val result=separateEvenOdd(numbers)
  println(result)
}