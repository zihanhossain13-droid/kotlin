class BankAccount(
var accountHolder:String,
private var balance:Int
){
  fun showBalance(){
    println(balance)
  }
  fun deposit(amount:Int){
    if(amount>0){
    balance+=amount
    }else{
      println("Invalid Amount")
    }
  }
  fun withdraw(amount:Int){
    if(amount<=0){
      println("Invalid amount")
    }else if(amount>balance){
      println("Insufficient Balance")

    }else{
    balance-=amount
  }

}
}
fun main(){
  val account=BankAccount(accountHolder="Zihan",balance=10000)
  account.deposit(500)
  account.withdraw(2000)
  account.showBalance()
}
