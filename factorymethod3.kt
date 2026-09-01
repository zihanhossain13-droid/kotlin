class User(
var name:String,
var role:String
)
object UserFactory{
  fun createAdmin(name:String):User{
    return User(name,"Admin")
  }
  fun createGuest(name:String):User{
    return User(name,"Guest")
  }
}

fun main(){
  val admin=UserFactory.createAdmin("Zihan")

  println(admin.name)
  println(admin.role)
  val guest=UserFactory.createGuest("Rahim")
  println(guest.name)
  println(guest.role)
}