interface DownlinkCall{
  fun onComplete()
  fun onError()
}
fun downloadFile(size:Int,callback:DownlinkCall){
  if(size<=100){
    callback.onComplete()
  }else{
    callback.onError()
  }
}
fun main(){
  downloadFile(5,object:DownlinkCall{
    override fun onComplete(){
      println("Completed")
    }
    override fun onError(){
      println("Error")
    }
  })
}