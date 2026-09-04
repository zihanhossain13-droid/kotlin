fun sumof(numbers:List<User>):Int{
    return numbers.sumOf{
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
    User("Karim", 30)
)
val result=sumof(users)
println(result)
}