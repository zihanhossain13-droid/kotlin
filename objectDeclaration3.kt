object BankAccount{
  var balance=1000
  fun deposit(amount:Int){
    balance+=amount
  }
  fun withdraw(amount:Int){
    balance-=amount
  }
}
fun main(){
  BankAccount.deposit(500)
  BankAccount.withdraw(400)
  println(BankAccount.balance)
}