interface Vehicle{
  fun start()
  fun stop()
}
fun main(){
  val car=object:Vehicle{
    val brand="Toyota"
    override fun start(){
      println("$brand is starting")
    }
    override fun stop(){
      println("$brand is stopping")
    }
  }
  car.start()
  car.stop()
}