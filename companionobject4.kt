class User(
  val name:String
){
  companion object{
    fun createUser(name:String):User{
      return User(name)
    }
  }
}
fun main(){
  val user=User.createUser("Zihan")
  println(user.name)
}