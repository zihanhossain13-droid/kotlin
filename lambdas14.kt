fun main(){
  val checkNumbers:(Int,Int)->String={a,b->if(a>b) "A is Bigger" else "B is Bigger"}
  println(checkNumbers(10,40))
}