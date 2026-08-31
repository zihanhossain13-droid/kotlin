data class Product(
    val name: String,
    val price: Int,
    val quantity: Int
)
fun main(){
  var product=Product(name="Laptop",price=80000,quantity=2)
  println(product.component1())
  println(product.component2())
  println(product.component3())
}