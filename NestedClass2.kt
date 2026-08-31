class Car(
var brand:String
){
  class Engine(
var type:String
  ){
    fun showEngine(){
      println(type)
    }

  }
  fun showCar(){
    println(brand)
  }

}
fun main(){
  var car=Car("Toyota")
  car.showCar()
  var engine=Car.Engine("Petrol")
  engine.showEngine()
}