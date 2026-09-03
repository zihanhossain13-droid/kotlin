fun square(a:Int,operation:(Int)->Int):Int{
  return operation(a)
}
fun main(){
  val result=square(5){it*it}
  println(result)
}