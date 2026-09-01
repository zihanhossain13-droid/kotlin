class User private constructor(
var username:String,
var age:Int
){
  companion object{
    fun createUser(username:String,age:Int):User?{
if(username.length<3 || age<18){
  return null
}
return User(username,age)
    }
  }
  
}
fun main(){
  val user=User.createUser("Zihan",29)
  println(user?.username)
  println(user?.age)
}