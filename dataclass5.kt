data class User(
  var name:String,
  var age:Int,
  var email:String
)
fun main(){
  var user=User(name="Zihan Hossain",age=23,email="zihanhossain@gmail.com")
  var user2=User(name="Zihan Hossain",age=23,email="zihanhossain@gmail.com")
  println(user==user2)

}