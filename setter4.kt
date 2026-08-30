class Product(
var name:String,
price:Int
){
  var updatePrice:Int=price
  set(updatePrice){
    if(updatePrice<0){
      println("Invalid Price")
    }
    else if(updatePrice==0){
      println("Price can't be zero.")
    }
    else{
      field=updatePrice
      println("Price Updated")
    }
  }
}
fun main(){
  var p=Product(name="Chair",price=500)
  p.updatePrice=550
  println(p.updatePrice)
}