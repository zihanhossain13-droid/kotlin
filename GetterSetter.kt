class BankAccount(
var name:String,
balance:Int
){
  var balance:Int=balance
  set(value){
  if(value< 0){
    println("Invalid Balance")
  }
  else if(value == 0){
    println("Balance can't be zero")
  }
  else if(value > 0){
    field=value

  }
  }
  get(){
    if(field>= 100000){
      println("VIP")
    }
    else if(field>= 50000){
      println("Premium")
    }
    else{

    println("Regular")
    }
    return field
  }

}
fun main(){
  var z=BankAccount(name="Zihan",balance=3400)
  z.balance=3500
  println(z.balance)
}