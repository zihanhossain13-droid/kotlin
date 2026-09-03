fun createChecker(type:String):(Int)->Boolean{
  if(type=="Even")
  return{number->number%2==0}
  else{
    return {number->number>0}
  }
}
fun main(){
  val result=createChecker("Even")
  println(result(5))
}