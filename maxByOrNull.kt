fun getOldest(users: List<User>): User? {
    return users.maxByOrNull{it.age}
}
data class User(
    val name: String,
    val age: Int
)
fun main(){
val users = listOf(
    User("Zihan", 25),
    User("Rahim", 20),
    User("Karim", 30)
)
val result=getOldest(users)
println(result)
}