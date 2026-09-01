fun String?.getNameOrDefault():String{
  return this?:"Unknown"
}
fun main(){
  val name="Zihan".getNameOrDefault()
  println(name)
}