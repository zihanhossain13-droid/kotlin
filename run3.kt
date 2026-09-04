fun calculate(number: Int): Int {
    return number.run{
      this*this
    }
}
fun main(){
  val number=4
  val result=calculate(number)
  println(result)
}