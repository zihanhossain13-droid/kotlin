sealed class OrderState{
  class Pending(var orderId:String):OrderState()
  class Shipped(var trackingId:String):OrderState()
  class Delivered(var address:String):OrderState()
  class Cancelled(var reason:String):OrderState()
}
fun main(){
  var orderstate:OrderState=OrderState.Shipped("TKR234")
  when(orderstate){
    is OrderState.Pending->println("Order pending:${orderstate.orderId}")
    is OrderState.Shipped->println("Order Shipped:${orderstate.trackingId}")
    is OrderState.Delivered->println("Order Delivered to:${orderstate.address}")
    is OrderState.Cancelled->println("Order Cancelled:${orderstate.reason}")
  }
}