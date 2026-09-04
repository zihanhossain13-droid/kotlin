data class User(
    var name: String,
    var age: Int
)

fun updateUser(user: User): String {
    return user.run{
      this.age++
      "${this.name} is ${this.age} year old."
    }
}
fun main(){
  val result=updateUser(User("Zihna",24))
  println(result)
}