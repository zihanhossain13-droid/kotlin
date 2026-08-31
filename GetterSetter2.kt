class Product(
  var name:String,
  price:Int,
discount:Double
){
var priceSet:Int=price
set(value){
  if(value < 0){
    println("Invalid Price")
  }else if(value == 0){
    println("Price can't be zero")
  }else{
    field=value
    println(priceSet)
  }
}
var discounts:Double=discount
set(value){
  if(value < 0){
    println("Invalid Discount")
  }
  else if(value> 50){
    println("Discount too high")
  }
  else{
    field=value
    println(discounts)
  }
}
val newPrice:Double
get(){
return priceSet - (priceSet * discounts / 100)
}
}
fun main(){
  val p=Product(name="Chair",price=1000,discount=15.5)
  p.priceSet=340
  p.discounts=15.6
println(p.newPrice)
}