class AgeException(message:String):Exception(message)
fun main(){
  var age=16
  try{
    if(age<18){
      throw AgeException("You must be 18+")
    }
  }
  catch(e:AgeException){
    println(e.message)
  }
  finally{
    println("Checking Finished")
  }
}