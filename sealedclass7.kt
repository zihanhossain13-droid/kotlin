sealed class LoginState{
  class Success(var username:String):LoginState()
  class Error(var message:String):LoginState()
  object Loading:LoginState()
}
fun main(){
  var login:LoginState=LoginState.Loading
  when(login){
    is LoginState.Success->println(login.username)
    is LoginState.Error->println(login.message)
    is LoginState.Loading->println("Please wait")
  }
}