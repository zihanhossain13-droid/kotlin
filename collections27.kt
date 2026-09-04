fun usersById(users: List<User>): Map<Int, User> {
    return users.associateBy{it.id}
}
data class User(
    val id: Int,
    val name: String
)
fun main(){

val users = listOf(
    User(101, "Zihan"),
    User(102, "Rahim"),
    User(103, "Karim")
)
var result=usersById(users)
println(result)
}