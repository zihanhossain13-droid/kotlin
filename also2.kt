data class User(
    var name: String,
    var age: Int
)

fun processUser(user: User): User {
  return user.also{
    println(it.name)
    println(it.age)
  }
}
fun main(){
  var result=processUser(User("Zihan",22))
}