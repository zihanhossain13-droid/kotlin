open class Notification(var username:String){
  open fun sound(){
    println("Sending notification to $username")
  }
}
fun main(){
  var notification=object:Notification("Zihan"){
    override fun sound(){
      println("Sending notification to $username")
    }
  }
  notification.sound()
}