class ShoppingCart{
  var total:Int=0
  inner class Item{
    fun addPrice(price:Int){
      if(price<=0){
        println("Invalid Price")
      }
      else{
        total+=price
        println("Price Added")
      }
    }
  }
}
fun main(){
  var shop=ShoppingCart()
  var item=shop.Item()
  item.addPrice(400)
}