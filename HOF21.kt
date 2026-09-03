fun processNumber(number:List<Int>,operation:(Int)->Int):List<Int>{
  return number.filter{it%2==0}.map(operation)
}
fun main(){
  val numbers = listOf(5, 10, 15, 20, 25, 30)
  val result=processNumber(numbers){ it*2}
  println(result)
}