fun addTen(numbers: List<Int>): List<Int> {
    return numbers.map{it+10}
}
fun main(){
 val numbers = listOf(5, 10, 15, 20)
  val result=addTen(numbers)
  println(result)
}