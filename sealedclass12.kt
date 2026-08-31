sealed class UserState{
  object Loading:UserState()
  class Success(val users:List<String>):UserState()
  class Error(val message:String):UserState()
  object Empty:UserState()
}
fun main(){
  val userstate:UserState=UserState.Success(listOf("Zihan","Mahfuz","Karim"))
  when(userstate){
    is UserState.Success->{
      if(userstate.users.isEmpty()){
        println("No users found.")
      }else{
        println("Users found in:${userstate.users.first()}")
      }
    }
    is UserState.Loading->println("Please wait")
    is UserState.Error->println("Error:${userstate.message}")
    is UserState.Empty->println("No Users Found")
  }
}