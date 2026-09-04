fun userNameToId(users: List<User>): Map<String, Int> {
    return users.associate{
        it.name to it.id

    }
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
val result=userNameToId(users)
println(result)
}
