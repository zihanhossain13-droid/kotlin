class NumberException(message:String):Exception(message)
fun main(){
  val number=0
  try{
    if(number==0){
      throw NumberException("Number can't be zero.")
    }
  }
  catch(e:NumberException){
    println(e.message)
  }
  finally{
    println("Execute")
  }
}