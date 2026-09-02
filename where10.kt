fun <T>findMin(a:T,b:T):T
where T:Comparable<T>{
  return if(a.compareTo(b)<0){
    a
  }else{
    b
  }

}
fun main(){
  val compare=findMin(10,10)
  println(compare)
  val compare2=findMin(5.5,2.5)
  println(compare2)
}