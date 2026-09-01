class Box<T>(val value:T){
  fun show(){
    println(value)
  }
}
fun main(){
  val intbox=Box(100)
  intbox.show()
  val stringbox=Box("Zihan")
  stringbox.show()
}