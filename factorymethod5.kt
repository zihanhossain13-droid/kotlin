class BankAccount private constructor(
var accountNumber:String,
var balance:Double
){
  companion object{
    fun createAccount(accountNumber:String,balance:Double):BankAccount?{
      if (balance<0){
        return null
      }
      return BankAccount(accountNumber,balance)
    }
  }
}
fun main(){
  val bankAccount=BankAccount.createAccount("1234A",27000.0)
  println(bankAccount?.accountNumber)
  println(bankAccount?.balance)
}