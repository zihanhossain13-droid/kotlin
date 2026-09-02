fun <T>isGreater(a:T,b:T):Boolean
where T:Number,T:Comparable<T>{
  return a.compareTo(b)>0
}
fun main(){
  val compare=isGreater(10,20)
  println(compare)
}