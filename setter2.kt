class BankAccount(
var accountHolder:String,
balance:Int
){
  var newBalance:Int=balance
  set(value){
    if(value<0){
      println("Invalid Balance")
    }else{
      field=value
      println("Balance Updated")
    }
  }

}
fun main(){
  var p=BankAccount(accountHolder="Zihan",balance=230)
  p.newBalance=3400
  println(p.newBalance)
}