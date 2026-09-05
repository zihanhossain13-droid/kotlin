data class User(
    var name: String,
    var age: Int
)

fun processUser(user: User): User {
  return user.apply{
    name="Zihan"
    age=25
  }
  return user.also{
    println(it.name)
    println(it.age)
  }
    
    return user
}
fun main(){
  var output=processUser(User("",0))
  println(output)
}