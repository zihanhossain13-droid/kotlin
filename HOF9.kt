fun calculate(a:Int,b:Int,operation:(Int,Int)->String):String{
  return operation(a,b)
}
fun main(){
  val result=calculate(10,20){a,b->if(a>b) "A is Bigger" else if(b>a) "B is Bigger" else "Both are equal" }
  println(result)
}