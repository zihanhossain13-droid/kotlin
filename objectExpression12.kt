interface shoppingCart{
  fun addItem()
  fun removeItem()
  fun showItem()
}
fun main(){
  val shop=object:shoppingCart{
    private var items=0
    override fun addItem(){
      items++
    }
    override fun removeItem(){
      if(items<=0){
        println("Invalid")
      }else{
      items--
    }
    }
    override fun showItem(){
      println(items)
    }
  }
  shop.addItem()
  shop.removeItem()
  shop.showItem()
}