fun List<String?>.cleanNames():List<String>{
  return this.filterNotNull()
}
fun main(){
  val list=listOf("Zihan",null,"Hossain","Rahim")
  val result=list.cleanNames()
  println(result)
}