interface PaymentCallback{
  fun onSuccess(amount:Double)
  fun onFailed(reason:String)
}
fun processPayment(amount:Double,callback:PaymentCallback){
  if(amount>=500){
    callback.onSuccess(amount)
  }else{
    callback.onFailed("Minimum payment is 500")
  }
}
fun main(){
  processPayment(5000.0,object:PaymentCallback{
    override fun onSuccess(amount:Double){
      println("Payment Success.")
    }
    override fun onFailed(reason:String){
      println("Payment Failed")
    }
  })
}