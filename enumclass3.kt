enum class PaymentMethod{
  CASH,
  CARD,
  BKASH,
  NAGAD
}
fun main(){
  val method:PaymentMethod=PaymentMethod.BKASH
  when(method){
    PaymentMethod.CASH->println("Pay with CASH")
    PaymentMethod.CARD->println("Pay with CARD")
    PaymentMethod.BKASH->println("Pay with BKASH")
    PaymentMethod.NAGAD->println("Pay with NAGAD")
  }
  println(method.name)
  println(method.ordinal)
}