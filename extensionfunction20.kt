fun List<Int>.positiveDoubles():List<Int?>{
  return this.filter{it>0}.map{it*2}
}
fun main(){
  val list=listOf(1,2,3,4,5,-5,-6)
  val result=list.positiveDoubles()
  println(result)
}