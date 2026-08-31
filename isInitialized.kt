class User{
  lateinit var name:String
  fun check():Boolean{
    if(::name.isInitialized){
      return true
    }else{
      return false
    }
  }
}
fun main(){
  val v=User()
  v.name="Zihan Hossain"
  println(v.check())
}