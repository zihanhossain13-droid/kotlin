class Temperature(
celsius:Double
){
  var newCelsius:Double=celsius
  set(value){
    if(value<-273.15){
      println("Invalid temperature")
    }
    else{
      field=value
      println("Temperature Updated")
    }
  }


}
fun main(){
  var p=Temperature(celsius=45.6)
  p.newCelsius=56.8
  println(p.newCelsius)
}