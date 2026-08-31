class BankAccount(
  var accountHolder:String,
  var balance:Int
){
  val accountType:String
  get(){
    if(balance >= 500000){
      return "Platinum"
    }
    else if(balance >= 200000){
      return "Gold"
    }
    else if(balance >= 50000){
      return "Silver"

    }
    else if(balance >= 10000){
      return  "Bronze"
    }
    return "Basic"
  }


}
fun main(){
  val p=BankAccount(accountHolder="Zihan",balance=100000)
  println(p.accountType)
}