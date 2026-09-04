data class User(
    val name: String,
    val age: Int
)

fun printUser(user: User) {
    with(user) {
      println(this.name)
      println(this.age)
    }
}
fun main(){
  printUser(User("Zihan",24))
  
}