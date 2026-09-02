fun <T>Compare(a:T,b:T):Boolean
where T:Number,T:Comparable<T>{
  return a.compareTo(b)==0
}
fun main(){
  val compare=Compare(10,20)
  println(compare)
}