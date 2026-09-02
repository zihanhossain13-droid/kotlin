fun main(){
  val age=15
  try{
    if(age<18){
      throw Exception("Age must be 18+")
    }
    println("Welcome")
  }
  catch(e:Exception){
    println(e.message)

  }
}