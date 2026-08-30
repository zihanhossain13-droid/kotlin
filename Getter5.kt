class Product(
    var name:String,
var price:Int,
var quantity:Int

){
    val totalPrice:Int
    get(){
        var total=price*quantity
        if(total>=50000){
            println("Expensive Order")
        }else{
            println("Affordable Order")
        }
        return total
    }

}
fun main(){
    var p=Product(name="Zihan",price=100,quantity=5)
    println(p.totalPrice)
}