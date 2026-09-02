fun <T>findMax(a:T,b:T):T
where T:Number,T:Comparable<T>{
  return if(a.compareTo(b)>0){
     a
  }else{
     b
  }
}
fun main(){
  val compare=findMax(10,20)
  println(compare)
}