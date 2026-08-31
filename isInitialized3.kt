class User{
  lateinit var name:String
  lateinit var email:String
  fun checkUser(){
    if(::name.isInitialized && ::email.isInitialized){
      println("User Ready")
    }else{
      println("User Not Ready")
    }
  }
}
fun main(){
  val v=User()
  v.name="Zihan Hossain"
  v.email="zihan@gmail.com"
  v.checkUser()
}