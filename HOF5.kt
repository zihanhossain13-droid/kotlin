fun processName(name:String,operation:(String)->String):String{
  return operation(name)
}
fun main(){
  val output=processName("Zihan"){"Hello,$it"}
  println(output)
}