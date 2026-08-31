class University(
  var name:String

){
  class Address(
    var city:String,
    var country:String
    ){
      fun showAddress(){
        println(city)
        println(country)
      }

  }
  fun showUniversity(){
    println(name)
  }

}
fun main(){
  var U=University("Dhaka University")
  U.showUniversity()
  var A=University.Address(city="Dhaka",country="Bangladesh")
  A.showAddress()
}