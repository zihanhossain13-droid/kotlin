interface LoginCallback{
fun onStart()
fun onSuccess(username:String)
fun onFailed(reason:String)
}
fun login(username:String,password:String,callback:LoginCallback){
  callback.onStart()
  if(username=="Zihan" && password=="1234"){
    callback.onSuccess(username)
  }else{
    callback.onFailed("Failed")
  }
}
fun main(){
  login("Zihan","1234",object:LoginCallback{
    override fun onStart(){
      println("Start")
    }
    override fun onSuccess(username:String){
      println("Success")
    }
    override fun onFailed(reason:String){
      println("Failed")
    }
  })
}
