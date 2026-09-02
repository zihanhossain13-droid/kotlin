fun <T>findMax(a:T,b:T):T
where T:Comparable<T>{
  return if(a.compareTo(b)>0){
    a
  }else{
    b
  }

}
fun main(){
  val compare=findMax("Apple","Banana")
  println(compare)
}