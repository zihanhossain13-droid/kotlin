data class User(
    var name: String,
    var age: Int
)

fun createUser(): User {
  return User("Zihan",22).also{
    println("User created:${it.name}")
    println("User:${it.name} Age:${it.age}")
  }
}
fun main(){
  var output=createUser()
}