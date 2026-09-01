fun List<Int>.findMax():Int{
  return this.max()
}
fun main(){
  val numbers=listOf(1,2,4,5,6,7,8)
  val result=numbers.findMax()
  println(result)
}