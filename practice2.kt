abstract class Vehicle(
var vehicleName:String,
private var rentPerDay:Int
){
  fun calculateRent(days:Int){
    if(days<=0 || rentPerDay<=0){
      println("Invalid")
    }else{
      
      val totalRent=rentPerDay*days
      println(totalRent)
    }
  }
  abstract fun output()

}
class Car(vehicleName:String,rentPerDay:Int,var numberOfStates:Int):Vehicle(vehicleName,rentPerDay){
override fun output(){
  println(vehicleName)
  println(numberOfStates)
  
}

}
class Bike(vehicleName:String,rentPerDay:Int,var engineCC:Int):Vehicle(vehicleName,rentPerDay){
override fun output(){
  println(vehicleName)
  
  println(engineCC)
}
}
fun main(){
  var p:Vehicle=Car(vehicleName="rto",rentPerDay=5,numberOfStates=2)
  p.output()
  p=Bike(vehicleName="Fz",rentPerDay=10,engineCC=200)
  p.output()
  p.calculateRent(5)
  p.output()
}