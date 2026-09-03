fun createOperation(type:String):(Int)->Int{
  if(type=="square")
  return{ number->number*number}
  else{
    return{number->number*number*number}
  }

}
fun main(){
  val result=createOperation("square")
  println(result(2))
  val result2=createOperation("cube")
  println(result(3))
}