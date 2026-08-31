sealed class UiState{
  object Loading:UiState()
  class Success(val users:List<String>):UiState()
  class Error(val message:String):UiState()
  object Empty:UiState()
}
fun main(){
  var uistate:UiState=UiState.Success(listOf("Karim","Rahim","Mahfuz","Zihan"))
when(uistate){
  is UiState.Loading->println("Loading...")
  is UiState.Success->println("Users:${uistate.users}")
  is UiState.Error->println("Error:${uistate.message}")
  is UiState.Empty->println("No users found")

}
}