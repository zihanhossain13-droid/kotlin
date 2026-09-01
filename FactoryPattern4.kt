enum class PaymentType{
CASH,
CARD,
BKASH
}
class Payment(
  val amount:Double,
  val type:PaymentType
)
object PaymentFactory{
  fun createPayment(
    amount:Double,
    type:PaymentType
  ):Payment{
    return when(type){
      PaymentType.CASH->Payment(amount,PaymentType.CASH)
      PaymentType.CARD->Payment(amount,PaymentType.CARD)
      PaymentType.BKASH->Payment(amount,PaymentType.BKASH)
    }
  }
}
fun main(){
  val cash=PaymentFactory.createPayment(500.0,PaymentType.CASH)
  println(cash.amount)
  println(cash.type)
  val cash2=PaymentFactory.createPayment(400.0,PaymentType.CARD)
  println(cash2.amount)
  println(cash2.type)
  val cash3=PaymentFactory.createPayment(300.0,PaymentType.BKASH)
  println(cash3.amount)
  println(cash3.type)
}