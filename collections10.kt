fun findEvenNumber(numbers: List<Int>): Int? {
    return numbers.find{it%2==0}
}
fun main(){
  val numbers = listOf(5, 7, 9, 12, 14, 20)
  val result=findEvenNumber(numbers)
  println(result)
}