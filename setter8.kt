class Product(
  var name:String,
  price:Int,
  discount:Double

){
  var newPrice:Int=price
  set(value){
    if(value<0){
      println("Invalid Price")
    }
    else if(value==0){
      println("Price can't be zero")
    }
    else{
      field=value
      println("Price Updated")
    }
  }
  var newDiscount:Double=discount
  set(value){
    if(value<0){
      println("Invalid Discount")
    }
    else if(value>50){
      println("Discount too high")
    }
    else{
      field=value
      println("Discount updated")
    }
  }

}
fun main(){
  val p=Product(name="Chair",price=100,discount=15.5)
  p.newPrice=500
  println(p.newPrice)
  p.newDiscount=24.0
  println(p.newDiscount)
}
