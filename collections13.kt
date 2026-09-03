fun hasEvenNumber(numbers: List<Int>): Boolean {
    return numbers.any{it<0}
}
fun main(){
  val numbers = listOf(5, 10, -3, 20, 15)
  val result=hasEvenNumber(numbers)
  println(result)
}