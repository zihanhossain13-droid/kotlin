fun createOperation(type:String):(Int)->Int{
  if(type=="2")
  return {number->number*2}
  else{
  return {number->number*3}
  }

}
fun main(){
  val result=createOperation("2")
  println(result(2))
}