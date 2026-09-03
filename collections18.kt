fun countGreaterThanTen(numbers: List<Int>): Int {
    
    return numbers.count{
      it>10
    }
}
fun main(){
  val numbers = listOf(5, 12, 8, 20, 15, 3, 25)
  val result=countGreaterThanTen(numbers)
  println(result)
}