abstract class Vehicle(
var vehicleName:String,
private var rentPerDay:Int
){
  fun show(){
    println(rentPerDay)
  }
  protected fun getRent():Int{
return rentPerDay

  }
  abstract fun output()
  
}
interface Rentable{
  fun calculateRent(days:Int)
  }

class Car(vehicleName:String,rentPerDay:Int,var numberOfSeats:Int):Vehicle(vehicleName,rentPerDay),Rentable{
override fun calculateRent(days:Int){
    if(days<=0 || getRent()<=0){
      println("Invalid")
    }else{
      val total=days*getRent()
      val finalRent=total+500
      println(finalRent)
    }
  }
  override fun output(){
    println(vehicleName)
    println(numberOfSeats)
  }
  }


class Bike(vehicleName:String,rentPerDay:Int,var engineCC:Int):Vehicle(vehicleName,rentPerDay),Rentable{
  override fun calculateRent(days:Int){
    if(days<=0 || getRent()<=0){
      println("Invalid")
    }else{
      val total=days*getRent()
      val finalRent=total+200
      println(finalRent)
    }

  }
  override fun output(){
    println(vehicleName)
    println(engineCC)
  }

}
fun main(){
  var p:Vehicle=Car(vehicleName="Car",rentPerDay=34,numberOfSeats=5)
  p.output()
 
  var r:Rentable=p as Rentable
   r.calculateRent(15)
  p=Bike(vehicleName="Bike",rentPerDay=35,engineCC=150)
 
  p.output()
var z:Rentable=p as Rentable
 z.calculateRent(5)
  p.output()
}