data class User(
  var name:String,
  var age:Int
)
fun main(){
  var user=User(name="Zihan Hossain",age=23)
  var user2=user.copy()
  println(user==user2)
  println(user===user2)

}