fun Int.getPositiveOrNull():Int?{
  return this.takeIf{it>0 }
}
fun main(){
  val number=10.getPositiveOrNull()
  println(number)
}