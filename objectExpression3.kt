interface Employee{
  fun work()
}
fun main(){
  val developer=object:Employee{
    val name="Zihan Hossain"
    val role="Android Developer"
  
  override fun work(){
    println(name)
    println(role)
  }
  }
  developer.work()
}