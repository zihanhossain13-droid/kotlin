enum class OrderStatus(
val message:String,
val canCancel:Boolean
){
  PENDING("Order is Pending",true),
  SHIPPED("Order is Shiiped",false),
  DELIVERED("Order is Delivered",false),
  CANCELLED("Order is Cancelled",false);
  fun getStatusInfo():String{
    return when(this){
      PENDING->"Order is pending and can be cancelled."
      SHIPPED->"Order is shipped and can't be cancelled."
      DELIVERED->"Order is delivered and can't be cancelled."
      CANCELLED->"Order is Cancelled."
    }
  }

}
fun main(){
  val status:OrderStatus=OrderStatus.SHIPPED
  println(status.name)
  println(status.message)
  println(status.getStatusInfo())
}