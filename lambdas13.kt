fun main(){
  val checkAge:(Int)->String={if(it>=18) "Adult" else "Minor"}
  println(checkAge(40))
}