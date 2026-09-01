interface PaymentCallback{
  fun onSuccess()
  fun onFailed()
}
fun processPayment(amount:Double,callback:PaymentCallback){
  if(amount<=100){
    callback.onFailed()
  }else{
    callback.onSuccess()
  }
}
fun main(){
  processPayment(600.0,object:PaymentCallback{
    override fun onSuccess(){
      println("Payment Success.")
    }
    override fun onFailed(){
      println("Payment Failed")
    }
  })
}