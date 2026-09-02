class User(
var name:String,
var age:Int
){
constructor(name:String,age:Int, city:String):this(name,age){
  println(name)
  println(age)
  println(city)
}

}
fun main(){
  val data=User(name="Zihan Hossain",24,"Dhaka")
}