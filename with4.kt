data class Product(
    val price: Int,
    val quantity: Int
)

fun getTotal(product: Product): Int {
    return with(product){
      price*quantity
    }
}
fun main(){
  var result=getTotal(Product(120,3))
  println(result)
}