object BankAccount{
  private var balance=1000
  fun deposit(amount:Int){
    balance+=amount
  }
  fun withdraw(amount:Int){
    if(amount<=0){
      println("Invalid amount")
    }
    else if(amount>balance){
      println("Insufficient Balance")
    }else{
    balance-=amount
    }
  }
  fun getBalance():Int{
return balance
  }
}
fun main(){
  BankAccount.deposit(500)
  BankAccount.withdraw(300)
  var s=BankAccount.getBalance()
  println(s)
}