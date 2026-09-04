fun groupUsersByAge(users: List<User>): Map<Int, List<User>> {
    return users.groupBy{
      it.age
}
}
data class User(
    val name: String,
    val age: Int
)
fun main(){
val users = listOf(
    User("Zihan", 20),
    User("Rahim", 25),
    User("Karim", 20),
    User("Mahfuz", 25),
    User("Ali", 30))
val result=groupUsersByAge(users)
println(result)


}