fun getUniqueUsersByAge(users: List<User>): List<User> {
    return users.distinctBy{
        it.age
    }
}
 data class User(
    val id: Int,
    val name: String,
    val age: Int
)

fun main(){
   
val users = listOf(
    User(1, "Zihan", 20),
    User(2, "Rahim", 25),
    User(3, "Karim", 20),
    User(4, "Mahfuz", 30),
    User(5, "Ali", 25)
)
val result=getUniqueUsersByAge(users)
println(result)
}