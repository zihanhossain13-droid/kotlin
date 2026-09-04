fun makeWindows(numbers: List<Int>): List<List<Int>> {
    return numbers.windowed(3)
}
fun main(){
  val numbers = listOf(1, 2, 3, 4, 5)
  val result=makeWindows(numbers)
  println(result)
}