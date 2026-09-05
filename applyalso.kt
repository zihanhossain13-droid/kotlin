data class User(
    var name: String,
    var age: Int
)

fun processUser(user: User): User {
  return user.apply{
    name="Zihan"
    age=25
  }.also{
    println(it.name)
    println(it.age)
  }
}
fun main(){
  var output=processUser(User("",0))
  println(output)
}