fun <T>findMax(a:T,b:T):T
where T:Comparable<T>{
  return if(a.compareTo(b)>0){
    a
  }else{
    b
  }

}
fun main(){
  val compare=findMax(10,10)
  println(compare)
  val compare2=findMax(5.5,2.5)
  println(compare2)
}