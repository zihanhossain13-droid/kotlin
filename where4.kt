fun <T>Compare(a:T,b:T):Boolean
where T:Number,T:Comparable<T>{
  return a.compareTo(b)==0
}
fun main(){
  val compare=Compare(4.0,4.0)
  println(compare)
}