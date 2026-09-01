sealed class LoginResult{
  class Success(val username:String):LoginResult()
  class Failed(val message:String):LoginResult()
  object Loading:LoginResult()
}
object LoginFactory{
  fun login(username:String,password:String):LoginResult{
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
    is LoginResult.Success->println("Login Success:${result.username}")
    is LoginResult.Failed->println("Login Failed:${result.message}")
    is LoginResult.Loading->println("Please wait")
  }
}