fun multiply(a:Int,b:Int,operation:(Int,Int)->Int):Int{
  return operation(a,b)
}
fun main(){
  var multiply=multiply(10,20){a,b->a*b}
  println(multiply)
}