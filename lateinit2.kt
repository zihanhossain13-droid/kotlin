class Profile{
  lateinit var username:String
  lateinit var bio:String
  fun showInfo(){
    println(username)
    println(bio)
  }
}
fun main(){
  var p=Profile()
  p.username="Zihan@"
  p.bio="Hey,I am Zihan Hossain"
  p.showInfo()
}