class Payment(
  var amount:Double
){
  companion object{
    fun createPayment(amount:Double):Payment{
return Payment(amount)
    }
  }
}
fun main(){
  var v=Payment.createPayment(32.0)
  println(v.amount)
}