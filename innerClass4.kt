class BankAccount(
var accountHolder:String,
var balance:Int
){
  inner class Transaction{
    fun deposit(amount:Int){
      if(amount<=0){
        println("Invalid amount")
      }
      else{
        balance+=amount
        println("Deposit Successful")
      }
    }
    fun withdraw(amount:Int){
      if(amount<=0){
        println("Invalid withdrawal")
      }
      else if(amount>balance){
        println("Insufficient Balance")
      }else{
        balance-=amount
        println("Withdrawal Successfully")
      }
    }
  }
}
fun main(){
  var Bank=BankAccount(accountHolder="Zihan Hossain",balance=5000)
  var transaction=Bank.Transaction()
  transaction.deposit(1000)
  transaction.withdraw(2000)
}