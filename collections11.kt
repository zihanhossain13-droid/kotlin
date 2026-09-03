fun hasEvenNumber(numbers: List<Int>): Boolean {
    return numbers.any{it%2==0}
}
fun main(){
  val numbers = listOf(5, 10, 15, 20, 25)
  val result=hasEvenNumber(numbers)
  println(result)
}