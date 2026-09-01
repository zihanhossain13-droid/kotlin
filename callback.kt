interface PaymentCallback{
  fun onSuccess()
  fun onFailed()
}
fun processPayment(callback:PaymentCallback){
  val success=true
  if(success){
    callback.onSuccess()
  }else{
    callback.onFailed()
  }
}
fun main(){
  processPayment(object:PaymentCallback{
    override fun onSuccess(){
      println("Payment Successful.")
    }
    override fun onFailed(){
      println("Payment Failed")
    }
  })
}