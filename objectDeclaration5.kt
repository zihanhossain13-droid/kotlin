object BankAccount{
  private var balance=1000
  fun deposit(amount:Int){
    balance+=amount
  }
  fun withdraw(amount:Int){
    if(amount>balance){
      println("Invalid amount")
    }else{
    balance-=amount
    }
  }
  fun showBalance(){
    println(balance)
  }
}
fun main(){
  BankAccount.deposit(500)
  BankAccount.withdraw(300)
  BankAccount.showBalance()
}