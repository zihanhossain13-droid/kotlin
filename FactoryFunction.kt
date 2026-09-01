sealed class LoginResult{
  class Success(var username:String):LoginResult()
  class Failed(var message:String):LoginResult()
  object Loading:LoginResult()
}
object LoginFactory{
  fun login(username:String,password:String):LoginResult{
    val loading=LoginResult.Loading
    println("Please wait")
    if(username=="Zihan" && password=="1234"){
      return LoginResult.Success(username)
    }else{
      return LoginResult.Failed("Invalid username or password")
    }
  } 
}
fun main(){
  val result=LoginFactory.login("Zihan","1234")
  when(result){
    is LoginResult.Success->println("Success")
    is LoginResult.Failed->println("Failed")
    is LoginResult.Loading->println("Please Wait")
  }
}