fun main(){
  val checkNumber:(Int)->String={if(it>10) "Big" else "Small"}
  println(checkNumber(16))
}