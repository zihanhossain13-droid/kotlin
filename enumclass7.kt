enum class OrderStatus{
  PENDING,
  SHIPPED,
  DELIVERED,
  CANCELLED
}
fun main(){
  val status:OrderStatus=OrderStatus.SHIPPED
  when(status){
    OrderStatus.PENDING->println("Order is pending")
    OrderStatus.SHIPPED->println("Order is shipped")
    OrderStatus.DELIVERED->println("Order is delivered")
    OrderStatus.CANCELLED->println("Order is cancelled")
  }
  println(status.name)
  println(status.ordinal)
}