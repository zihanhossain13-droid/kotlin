fun <T:Comparable<T>>findMax(first:T,second:T):T{
  return if(first.compareTo(second)>0){
    first
  }else{
    second
  }
}
fun main(){
  val value=findMax("Apple","Banana")
  println(value)
}