fun Int.isPositive():Boolean{
  if(this<0){
    return false
  }else{
    return true
  }
}
fun main(){
  val result=10.isPositive()
  println(result)
}