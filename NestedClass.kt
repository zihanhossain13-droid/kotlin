class computer(
  var brand:String
){
  class processor(
    var model:String){
    fun showProcessor(){
      println(model)
    }
  }
}
fun main(){
  var c=computer("Dell")
  var j=computer.processor("intel i5")
  
  println(c.brand)
  j.showProcessor()
}