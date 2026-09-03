data class User(
  var name:String,
  var age:Int
)
fun processUsers(
    users: List<User>,
    condition: (User) -> Boolean,
    operation: (User) -> String
): List<String> {
    return users.filter(condition).map(operation)
}
fun main(){
  val users = listOf(
    User("Zihan", 20),
    User("Rahim", 16),
    User("Karim", 25),
    User("Mahfuz", 15)
)
val result=processUsers(users,{it.age>=18},{it.name})
println(result)
}