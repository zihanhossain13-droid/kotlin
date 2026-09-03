fun main(){
  val findMax:(Int,Int,Int)->Int={a,b,c->if(a>b && a>c) a else if(b>a && b>c) b else c}
  println(findMax(10,20,30))
}