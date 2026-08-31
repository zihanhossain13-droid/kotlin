enum class UserRole(
  val permissionLevel:Int
){
  ADMIN(4),
  MODARETOR(3),
  USER(2),
  GUEST(1);
  fun canDeletepost():Boolean{
    return when(this){
      ADMIN->true
      MODARETOR->true
      USER->false
      GUEST->false
    }
  }

}
fun main(){
  val permission:UserRole=UserRole.MODARETOR
  println(permission.name)
  println(permission.ordinal)
  println(permission.permissionLevel)
  println(permission.canDeletepost())
}