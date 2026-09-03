fun createMultiplier(factor:Int):(Int)->Int{
  return {number->number*factor}
}
fun main(){
  val result=createMultiplier(2)
  println(result(10))
  val result2=createMultiplier(5)
  println(result2(10))

  }
