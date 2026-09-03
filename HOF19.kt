fun processNumber(numbers:List<Int>,operation:(Int)->Int):List<Int>{
  return numbers.map(operation)
}
fun main(){
  val number=listOf(10,20,30,40)
  val result=processNumber(number){it->if(it%2==0) it*2 else it*3 }
  println(result)
}