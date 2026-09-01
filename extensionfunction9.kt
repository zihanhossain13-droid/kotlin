fun List<String>.toUpperNames():List<String>{
  return map{it.uppercase()}
}
fun main(){
  val List=listOf("Zihan","Hossain","Rahim")
  val result=List.toUpperNames()
  println(result)
}