fun makeChunks(numbers: List<Int>): List<List<Int>> {
 return numbers.chunked(3)   
}
fun main(){
  val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
  val result=makeChunks(numbers)
  println(result)
}