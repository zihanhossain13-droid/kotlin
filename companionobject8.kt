class User(
  val username:String
){
  companion object{
    fun createUser(username:String):User?{
      if(username.length<3){
        return null
      }else{
    
    return User(username)
      }
    }
  }
}
fun main(){
  val user=User.createUser("Zihan")
  if(user!=null){
    println(user.username)
  }else{
    println("Invalid username")
  }
}