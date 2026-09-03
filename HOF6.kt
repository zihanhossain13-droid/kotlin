fun processName(name:String,operation:(String)->String):String{
  return operation(name)
}
fun main(){
  val output=processName("Zihan"){it->if(it.length>=5) "Long Name" else "Short Name"}
  println(output)
}