class BankAccount(
  var balance:Int
){
  inner class Transaction{
    fun deposit(amount:Int){
      if(amount<=0){
        println("Invalid Amount")
      }
      else{
        balance+=amount
        println("Deposit Successful")
      }
    }
  }
}
fun main(){
  var Bank=BankAccount(1000)
  var transaction=Bank.Transaction()
  transaction.deposit(400)
}