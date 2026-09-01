class Box<out T>(val value:T){
  

}
fun main(){
  val box=Box("Zihan")
  println(box.value)
  
}