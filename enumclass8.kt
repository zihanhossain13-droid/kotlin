enum class OrderStatus(
  val message:String
){
  PENDING("Please wait"),
  SHIPPED("Your order is on the way"),
  DELIVERED("Order delivered successfully"),
  CANCELLED("Order cancelled")
}
fun main(){
  val status:OrderStatus=OrderStatus.SHIPPED
  when(status){
    OrderStatus.PENDING->println(status.message)
    OrderStatus.SHIPPED->println(status.message)
    OrderStatus.DELIVERED->println(status.message)
    OrderStatus.CANCELLED->println(status.message)
  }
  println(status.name)
  println(status.ordinal)
}