class User private constructor(
var username:String,
var age:Int,
var role:String
){
  companion object{
    fun createAdmin(username:String,age:Int):User?{
      if(username.length<3 || age<18){
        return null
      }
      return User(username,age,"admin")

    }
    fun createUser(username:String,age:Int):User?{
      if(username.length<3||age<18){
        return null
      }
      return User(username,age,"Guest")
    }
  }
}
fun main(){
  val admin=User.createAdmin("Zihan",18)
  println(admin?.username)
  println(admin?.age)
  println(admin?.role)
  val guest=User.createUser("Zihan",34)
  println(guest?.username)
  println(guest?.age)
  println(guest?.role)
}