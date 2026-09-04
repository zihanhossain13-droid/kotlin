data class Product(
    val name: String,
    val price: Int,
    val quantity: Int
)

fun getTotal(product: Product): Int {
    return product.run{
      this.price*this.quantity
    }
}
fun main(){
  val product=Product("Laptop",5000,2)
  val result=getTotal(product)
  println(result)
}