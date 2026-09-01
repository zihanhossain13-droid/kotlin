fun List<Int>.doubleEvenNumbers():List<Int>{
  return this.filter{it%2==0}.map{it*2}
}
fun main(){
  val list=listOf(1,2,3,4,5,6,7,8)
  val result=list.doubleEvenNumbers()
  println(result)
}