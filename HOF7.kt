fun processNumber(number:Int,operation:(Int)->String):String{
  return operation(number)
}
fun main(){
  val result=processNumber(10){it->if(it%2==0) "Even" else "Odd"}
  println(result)
}