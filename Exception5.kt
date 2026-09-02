class ageException(message:String):Exception(message)
fun main(){
  val age=15
  try{
    if(age<18){
      throw ageException("Age must be 18+")
    }
  }
  catch(e:ageException){
println(e.message)
  }
  }
