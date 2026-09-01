interface OrderCallback{
  fun onSuccess(orderId:Int,amount:Double)
  fun onFailed(reason:String)
}
fun placeOrder(orderId:Int,amount:Double,callback:OrderCallback){
  if(amount>=1000){
    callback.onSuccess(orderId,amount)
  }else{
    callback.onFailed("Minimum amount is 1000")
  }

}
fun main(){
  placeOrder(45,5000.0,object:OrderCallback{
    override fun onSuccess(orderId:Int,amount:Double){
      println("Success")
    }override fun onFailed(reason:String){
      println("Failed")
    }
  })
}