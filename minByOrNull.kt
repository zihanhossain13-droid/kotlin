fun getYoungest(users: List<User>): User? {
    return users.minByOrNull{it.age}
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
val result=getYoungest(users)
println(result)
}