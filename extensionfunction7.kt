fun List<String>.longNames():List<String>{
  return this.filter{it.length>=5}
}
fun main(){
  val names=listOf("Zihan","Hossain","Tom")
  println(names.longNames())
}