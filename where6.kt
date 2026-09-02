fun <T>isSmaller(a:T,b:T):Boolean
where T:Number,T:Comparable<T>{
  return a.compareTo(b)<0
}
fun main(){
  val compare=isSmaller(10,20)
  println(compare)
}