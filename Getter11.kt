class Product(
  var name:String,
  var price:Int

){
  val Prices:Int=price
  get(){
    if(field >= 50000)
    {
      println("Expensive")
    }
    else if(field >= 10000){
      println("Moderate")
    }else{
      println("Affordable")
    }
    return field
  }

}
fun main(){
  val p=Product(name="Chair",price=1200)
  println(p.Prices)
}