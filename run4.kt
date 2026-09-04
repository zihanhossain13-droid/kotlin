data class User(
    val name: String,
    val age: Int
)

fun getUserInfo(user: User): String {
    return user.run{
      "${this.name} is ${this.age} years old."
    }
}
fun main(){
  val name=getUserInfo(User("Zihan",22))
  println(name)
  
}