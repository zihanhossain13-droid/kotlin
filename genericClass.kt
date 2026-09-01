class Box<T>(val value:T){
  fun show(){
    println(value)
  }
}
fun main(){
  val output=Box(100)
  output.show()
}