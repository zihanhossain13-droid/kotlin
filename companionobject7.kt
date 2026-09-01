class Product(
  var name:String,
  var price:Int
){
  fun showInfo(){
    println(name)
    println(price)
  }
  companion object{
    fun createProduct(name:String,price:Int):Product{
      return Product(name,price)
    }
  }
}
fun main(){
  var product=Product("Tv",700)
  var output=Product.createProduct("Laptop",60000)
  println(output.name)
  println(output.price)
}