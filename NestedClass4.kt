class SmartPhone(
var brand:String
){
class Processor(
  var model:String
){
  fun showProcessor(){
    println(model)
  }
}
  class Camera(
var megapixel:Int
  ){
    fun showCamera(){
      println(megapixel)
    }

  }
  fun showPhone(){
    println(brand)
  }
}
fun main(){
  var s=SmartPhone("SAMSUNG")
  s.showPhone()
  var p=SmartPhone.Processor("Snapdragon 8 Gen 3")
  p.showProcessor()
  var c=SmartPhone.Camera(200)
  c.showCamera()

}
