data class Product(
    var name: String,
    var price: Int,
    var quantity: Int
)

fun createProduct(): Product {
  return Product("",0,0).apply{
    name="Laptop"
    price=50000
    quantity=2
  }
}
fun main(){
  val output=createProduct()
  println(output)
}