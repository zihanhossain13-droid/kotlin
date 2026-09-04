fun flattenNumbers(numbers: List<List<Int>>): List<Int> {
    return numbers.flatten()
}
fun main(){
  val numbers = listOf( listOf(1, 2), listOf(3, 4), listOf(5, 6) )
  val result=flattenNumbers(numbers)
  println(result)
}