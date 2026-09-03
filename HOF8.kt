fun processNumber(number:Int,operation:(Int)->Int):Int{
  return operation(number)
}
fun main(){
  val result=processNumber(10){it->
    var first=it*2
  var second=first+10
  second}
  println(result)
}