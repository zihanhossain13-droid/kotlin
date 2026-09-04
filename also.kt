fun processName(name: String): String {
  return name.also{
    println(it)
  }
}
fun main(){
  var output=processName("Zihan")
  println(output)
}