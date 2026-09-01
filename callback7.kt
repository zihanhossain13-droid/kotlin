interface uploadCallback{
  fun onStart()
  fun onSuccess(filename:String,size:Double)
  fun onFailed(reason:String)
}
fun uploadFile(filename:String,size:Double,callback:uploadCallback){
  callback.onStart()
  if(size<=10){
    callback.onSuccess(filename,size)
  }
  else{
    callback.onFailed("File is too large.")
  }

}
fun main(){
  uploadFile("x.text",2.2,object:uploadCallback{
    override fun onStart(){
      println("Started")
    }
    override fun onSuccess(filename:String,size:Double){
      println("Success")
    }
    override fun onFailed(reason:String){
      println("Failed")
    }
  })
}