data class User(
    val name: String,
    val age: Int
)
fun sortedAge(user:List<User>):List<User>{
  return user.sortedBy{
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
val result=sortedAge(users)
println(result)
}