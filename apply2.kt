data class User(
    var name: String,
    var age: Int,
    var city: String
)

fun updateUser(user: User): User {
  return user.apply{
    age=25
    city="Dhaka"
  }
}
fun main(){
  val output=updateUser(User("Zihan",0,""))
  println(output)
}