fun List<String?>.upperCleanNames():List<String>{
  return this.filterNotNull().map{it.uppercase()}
}
fun main(){
  val list=listOf("Zihan",null,"Mahfuz",null,"Rahim")
  val result=list.upperCleanNames()
  println(result)
}