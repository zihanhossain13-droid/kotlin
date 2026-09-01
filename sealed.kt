sealed class LoginResult{
  class Success(val username:String):LoginResult()
  class Failed(val reason:String):LoginResult()
  object Loading:LoginResult()
}
fun main(){
  val result:LoginResult=LoginResult.Success("Zihan")
  when(result){
    is LoginResult.Success->println("Success")
    is LoginResult.Failed->println("Failed")
    is LoginResult.Loading->println("Please wait")
  }

}