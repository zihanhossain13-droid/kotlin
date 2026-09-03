fun square(a:Int,operation:(Int)->Int):Int{
  return operation(a)
}
fun main(){
  var result=square(5){a->a*a}
  println(result)
}