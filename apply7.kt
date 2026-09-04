data class User(
    var name: String,
    var age: Int
)

fun updateUser(user: User): User {
  return user.apply{
    name="Zihan"
    age=22
  }
}
fun main(){
  val output=updateUser(User("",0))
  println(output)
}