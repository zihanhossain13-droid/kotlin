class User(
  val name:String,
  val role:String
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
  val guest=UserFactory.createGuest("Hossain")
  println(guest.name)
  println(guest.role)
}