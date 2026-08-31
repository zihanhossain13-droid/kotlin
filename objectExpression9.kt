open class Payment(val username:String,val amount:Double){
  open fun pay(){
    println("$username is paying $amount")
  }
}
fun main(){
  val payment=object:Payment("Zihan",5000.0){
override fun pay(){
  if(amount>=5000){
    println("Zihan paid $amount successfully.")
  }
  else{
    println("Payment amount is low.")
  }
}
  }
  payment.pay()
}