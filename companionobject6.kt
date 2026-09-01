class Math{
  companion object{
    fun square(number:Int):Int{
      return number*number
    }
    fun cube(number:Int):Int{
      return number*number*number
    }
  }
}
fun main(){
  val answer=Math.square(5)
  println(answer)
  val ans=Math.cube(5)
  println(ans)
}