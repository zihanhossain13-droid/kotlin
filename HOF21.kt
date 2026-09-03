fun processNumber(number:List<Int>,operation:(Int)->Int):List<Int>{
  return number.filter{it>10}.map(operation)
}
fun main(){
  val numbers = listOf(3, 8, 12, 15, 20, 25)
  val result=processNumber(numbers){it*2}
  println(result)
}