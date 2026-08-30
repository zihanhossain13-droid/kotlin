class BankAccount(
var accountHolder:String,
balance:Int
){
  var newBalance:Int=balance
  set(value){
    if(value<0){
      println("Invalid Balance")
    }
    else if(value==0){
      println("Balance can't be zero")
    }
    else{
      field=value
      println("Balance Updated")
    }
  }
  
}
fun main(){
  var p=BankAccount(accountHolder="Zihan",balance=1000)
  p.newBalance=4000
  println(p.newBalance)
}