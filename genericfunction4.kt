fun <T:Number>showNumber(value1:T,value2:T):Double{
  val number1=value1.toDouble()
  val number2=value2.toDouble()
  return number1+number2
}
fun main(){
  val print=showNumber(100,200.0)
  println(print)
}