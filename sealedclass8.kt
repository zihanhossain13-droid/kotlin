sealed class PaymentState{
  class Success(var transactionId:String):PaymentState()
  class Failed(var reason:String):PaymentState()
  class Processing(var amount:Int):PaymentState()
  object Cancelled:PaymentState()
}
fun main(){
  var result:PaymentState=PaymentState.Success("A1")
  when(result){
    is PaymentState.Success->println("Payment Successful:${result.transactionId}")
    is PaymentState.Failed->println("Payment Failed;${result.reason}")
    is PaymentState.Processing->println("Processing Payment:${result.amount}")
    is PaymentState.Cancelled->println("Payment cancelled")
  }
}