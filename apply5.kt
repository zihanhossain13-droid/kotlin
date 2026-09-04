data class Product(
    var name: String,
    var price: Int,
    var quantity: Int
)

fun updateProduct(product: Product): Product {
  return product.apply{
    price=60000
    quantity=3
  }
}

fun main() {
    val product = Product("Laptop", 50000, 2)

    val output = updateProduct(product)

    println(output)
}