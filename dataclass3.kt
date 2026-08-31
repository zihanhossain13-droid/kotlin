data class Product(
var name:String,
var price:Int,
var quantity:Int
)
fun main(){
  var product=Product(name="Laptop",price=80000,quantity=2)
  println(product)
  var product2=product.copy(price=75000,quantity=3)
  println(product2)
}