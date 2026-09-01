interface LoginCallback{
  fun onSuccess()
  fun onFailed()
}
fun login(username:String,callback:LoginCallback){
  if(username=="Zihan"){
    callback.onSuccess()
  }else{
    callback.onFailed()
  }
}
fun main(){
  login("Zihan",object:LoginCallback{
    override fun onSuccess(){
      println("Login Success")
    }
    override fun onFailed(){
      println("Login Failed")
    }
  })
}