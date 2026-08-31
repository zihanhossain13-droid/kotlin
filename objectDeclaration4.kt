object UserSession{
  var username:String?=null
  var isLoggedIn=false
  fun login(name:String){
    username=name
    isLoggedIn=true
  }
  fun logout(){
    username=null
    isLoggedIn=false
  }
  fun showStatus(){
    println(username)
    println(isLoggedIn)
  }
}
fun main(){
  UserSession.login("Zihan")
  UserSession.logout()
  UserSession.showStatus()
}