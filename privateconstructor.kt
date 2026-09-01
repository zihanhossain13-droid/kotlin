class User private constructor(
val username:String
){
  companion object{
    fun createUser(username:String):User?{
if(username.length<3){
  return null
}
return User(username)
    }
  }

}
fun main(){
  val user=User.createUser("Zihan")
  println(user?.username)
}