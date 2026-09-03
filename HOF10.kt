fun createMultiplier(factor:Int):(Int)->Int{
  return {number->number*factor}
}
fun main(){
  val result=createMultiplier(10)
  println(result(5))

  }
