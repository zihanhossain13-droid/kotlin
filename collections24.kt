data class User(
    val name: String,
    val age: Int
)
fun sortUsersByAge(users: List<User>): List<User> {
    return users.sortedByDescending{
      it.age
    }
}
fun main(){
  val users = listOf(
    User("Zihan", 25),
    User("Rahim", 20),
    User("Karim", 30),
    User("Mahfuz", 22)
)
val result=sortUsersByAge(users)
println(result)
}