interface Wallet{
  fun addMoney(amount:Int)
  fun spendMoney(amount:Int)
}
interface WalletInfo{
  fun showBalance()
}
fun main(){
  
  var wallet=object:Wallet,WalletInfo{
    private var balance=500
    override fun addMoney(amount:Int){
balance+=amount
    }
    override fun spendMoney(amount:Int){
      if(amount<=0){
        println("Invalid amount")
      }else if(amount>balance){
        println("Insufficient Balance")
      }else{
        balance-=amount
      }
    }
    override fun showBalance(){
      println(balance)
    }
  }
  wallet.addMoney(500)
  wallet.spendMoney(200)
  wallet.showBalance()
}