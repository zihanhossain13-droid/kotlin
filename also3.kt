data class Product(
    var name: String,
    var price: Int
)

fun processProduct(product: Product): Product {
  return product.also{
    println("Product:${it.name}")
 println("Pirce:${it.price}")
            }
}
fun main(){
  var output=processProduct(Product("Laptop",60000))
}