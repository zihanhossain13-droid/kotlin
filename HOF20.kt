fun processName(names:List<String>,operation:(String)->String):List<String>{
  return names.map(operation)
}
fun main(){
  val name=listOf("Zihan","Mahfuz","Karim","Rahim")
  val result=processName(name){it->
    "Hello $it"
  }
  println(result)
}