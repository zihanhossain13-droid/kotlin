fun findNumber(numbers: List<Int>): Int?  {
    return numbers.find{it>=20}
}
fun main(){
 val numbers = listOf(5, 10, 15, 20, 25, 30)
 val result=findNumber(numbers)
  println(result)
}