data class User(
    var name: String,
    var age: Int
)

fun createUser(): User {
  return User("",0).apply{
    name="Zihan"
    age=22
  }
}
fun main(){
  val output=createUser()
  println(output)
}