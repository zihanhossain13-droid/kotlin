data class User(
  var name:String,
  var age:Int
)
fun processUser(users:List<User>,condition:(User)->String):List<String>{
  return users.map(condition)
}
fun main(){
  val users = listOf(
    User("Zihan", 20),
    User("Rahim", 16),
    User("Karim", 25),
    User("Mahfuz", 15)
)
val result=processUser(users,{it.name})
println(result)
}