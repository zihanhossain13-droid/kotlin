fun calculate(a:Int,b:Int,operation:(Int,Int)->Int):Int{
  return operation(a,b)
}
fun main(){
  val result=calculate(20,8){a,b->a*b}
  println(result)
}