enum class PaymentMethod(
  val fee:Double
){
  CASH(0.0){
    override fun getMessage(){
      println("CASH")
      println("Pay Using Cash")
      println(fee)
    }
  },
  CARD(2.0){
    override fun getMessage(){
      println("CARD")
      println("Pay USing CARD")
      println(fee)
    }
  },
  BKASH(1.5){
    override fun getMessage(){
      println("BKASH")
      println("Pay using BKASH")
      println(fee)
    }
  },
  NAGAD(1.4){
    override fun getMessage(){
      println("NAGAD")
      println("Pay Using NAGAD")
      println(fee)
    }
  };

  fun calculateFee(amount:Double):Double{
return amount*fee/100
  };
  abstract fun getMessage():Unit
}
fun main(){
  val payment:PaymentMethod=PaymentMethod.BKASH
  val feeAmount=payment.calculateFee(5000.0)
  println(feeAmount)
  payment.getMessage()
}