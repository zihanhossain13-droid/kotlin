fun processNumbers(numbers: List<Int>): List<Int> {
  return numbers.also{
    println(it)
  }
}
fun main(){
  var output=processNumbers(listOf(1,2,3,4,5,6))
  println(output)
}