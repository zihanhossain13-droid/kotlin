fun String?.getLengthOrZero():Int{
  return this?.length?:0
}
fun main(){
  val string="Zihan".getLengthOrZero()
  println(string)
}