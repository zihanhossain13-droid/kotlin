class Car(
var brand:String
){
  inner class Engine{
    fun showInfo(){
println(brand)
    }
  }
}
fun main(){
  var c=Car("Toyota")
  val engine=c.Engine()
  engine.showInfo()
}