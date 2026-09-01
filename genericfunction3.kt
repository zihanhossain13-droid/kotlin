fun <T:Number>showNumber(value1:T,value2:T){
  val number1=value1.toDouble()
  val number2=value2.toDouble()
  println(number1+number2)
}
fun main(){
  val print=showNumber(100,200)
}