class User{
  lateinit var name:String
  lateinit var email:String
  fun showInfo(){
    println(name)
    println(email)
  }
}
fun main(){
  var v=User()
  v.name="Zihan"
  v.email="zihan@gmail.com"
  v.showInfo()
}