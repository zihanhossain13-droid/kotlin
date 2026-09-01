class Notification(
  val message:String,
  val type:String
)
object NotificationFactory{
  fun createEmail(message:String):Notification{
    return Notification(message,"EMAIL")
  }
  fun createSms(message:String):Notification{
    return Notification(message,"SMS")
  }
  fun createPush(message:String):Notification{
    return Notification(message,"PUSH")
  }
}
fun main(){
  val email=NotificationFactory.createEmail("Hi")
  println(email.message)
  println(email.type)
  val sms=NotificationFactory.createSms("Hello")
  println(sms.message)
  println(sms.type)
  val push=NotificationFactory.createPush("Bye")
  println(push.message)
  println(push.type)
}