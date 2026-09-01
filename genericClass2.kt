class pairBox<K,V>(
  val key:K,
  val value:V){
  fun show(){
    println("$key:$value")
  }


}
fun main(){
  val pair=pairBox("age",25)
  pair.show()
  
}