fun Int.getNonZeroOrNull():Int?{
  return this.takeUnless{it==0}
}
fun main(){
  val result=19.getNonZeroOrNull()
  println(result)
}