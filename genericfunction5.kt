fun <T:Comparable<T>>findMax(first:T,second:T):T{
  return if(first.compareTo(second)>0){
    first
  }else{
    second
  }
}
fun main(){
  val value=findMax(100,400)
  println(value)
}