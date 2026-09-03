fun addTen(numbers: List<Int>,operation:(Int)->Int): List<Int> {
    return numbers.map(operation)
}
fun main(){
 val numbers = listOf(5, 10, 15, 20, 25)
  val result=addTen(numbers){it->
    if(it%2==0)
    it*2
  else
    it*3
  
}
  println(result)
}