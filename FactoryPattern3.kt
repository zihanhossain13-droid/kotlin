class Vehicle(
  var brand:String,
  var type:String,
  var wheels:Int
)
object VehicleFactory{
  fun createCar(brand:String):Vehicle{
    return Vehicle(brand,"Car",4)
  }
  fun createBike(brand:String):Vehicle{
    return Vehicle(brand,"Bike",2)
  }
  fun createTruck(brand:String):Vehicle{
    return Vehicle(brand,"Truck",6)
  }
}
fun main(){
  val car=VehicleFactory.createCar("Toyota")
  println(car.brand)
  println(car.type)
  println(car.wheels)
  val bike=VehicleFactory.createBike("TVS")
  println(bike.brand)
  println(bike.type)
  println(bike.wheels)
  val truck=VehicleFactory.createTruck("volvo")
  println(truck.brand)
  println(truck.type)
  println(truck.wheels)
}