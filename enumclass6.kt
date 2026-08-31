enum class PaymentMethod(
  val fee:Double
  
){
  CASH(0.0),
  CARD(2.0),
  BKASH(1.5),
  NAGAD(1.4);
fun calculateFee(amount:Double):Double{
  return amount*fee/100
}
}
fun main(){
  val method:PaymentMethod=PaymentMethod.BKASH
  val amount=1000.0
  val feeamount=method.calculateFee(amount)
  val finalamount=feeamount+amount
  when(method){
    PaymentMethod.BKASH->println("Payment with BKASH")
    PaymentMethod.CASH->println("Payment with CASH")
    PaymentMethod.CARD->println("Payment with CARD")
    PaymentMethod.NAGAD->println("Payment with NAGAD")
  }
  println(method.name)
  println(method.fee)
  println(feeamount)
  println(finalamount)
}
