class BankAccount(
var name:String,
var balance:Int
){
  val status:String
  get(){
    if(balance >= 100000){
      return "VIP"
    }
    else if(balance >= 50000){
      return "Premium"

    }
    else if(balance >= 10000){
      return "Standard"

    }
    else{
      return "Basic"
    }
    }
   

  }


fun main(){
  var p=BankAccount(name="Zihan",balance=10000)
  println(p.status)
}