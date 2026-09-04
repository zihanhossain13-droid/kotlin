data class User(
    val name: String,
    val age: Int,
    val city: String
)

fun getUserInfo(user: User): String {
  return with(user){
    "${this.name} is ${this.age} years old and lives in ${this.city}"
  }
}
fun main(){
  var output=getUserInfo(User("Zihan",22,"Dhaka"))
  println(output)
}