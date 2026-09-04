fun greet(name: String?): String {
    return name?.let {
    "Hello $it"
}?: "Hello Guest"
}
fun main(){
  val name: String? = "Zihan"
  val result=greet(name)
println(result)
}