class Product(
var name:String,
price:Int
){
  var newPrice:Int=price
  get(){
    if(field>=50000){
      println("Expensive Product")
    }else{
      println("Afforable Product")
    }
    return field
  }
}
fun main(){
  var p=Product(name="Zihan",price=4500)
  println(p.newPrice)
}