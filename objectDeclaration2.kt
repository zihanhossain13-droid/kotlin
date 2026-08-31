object Calculator{
  fun add(a:Int,b:Int):Int{
    return a+b
  }
  fun substract(a:Int,b:Int):Int{
    return a-b
  }
  fun multiply(a:Int,b:Int):Int{
    return a*b
  }
}
fun main(){
  println(Calculator.add(2,3))
  println(Calculator.substract(5,7))
  println(Calculator.multiply(6,9))
}