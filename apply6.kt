data class User(
    var name: String,
    var age: Int,
    var city: String
)

fun updateUser(user: User): User {
  return user.apply{
    name="Zihan"
    age=22
    city="Dhaka"
  }
}
fun main(){
  val output=updateUser(User("",0,""))
  println(output)
}