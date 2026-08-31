object UserManager{
  private var username:String?=null
  private var loggedIn=false
  fun login(name:String){
    username=name
    loggedIn=true

  }
  fun logout(){
    username=null
    loggedIn=false
  }
  fun getUsername():String?{
    return username
  }
  fun isLoggedIn():Boolean{
    return loggedIn
  }
}
fun main(){
  UserManager.login("Zihan Hossain")
  println(UserManager.isLoggedIn())
  UserManager.logout()

  println(UserManager.getUsername())
}