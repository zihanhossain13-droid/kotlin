class User(
var name:String,
var age:Int
)
object UserFactory{
  fun createUser(name:String,age:Int):User{
    return User(name,age)
  }
}

fun main(){
  val user=UserFactory.createUser("Zihan",24)
  println(user.name)
  println(user.age)
}