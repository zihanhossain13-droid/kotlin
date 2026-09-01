class MathUtils{
  companion object{
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
}

fun main(){
  println(MathUtils.add(10,20))
  println(MathUtils.substract(20,5))
  println(MathUtils.multiply(5,4))

}