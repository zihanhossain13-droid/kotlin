class BalanceException(message:String):Exception(message)
fun main(){
  var balance=500
  var withdraw=800
  try{
    if(withdraw>balance){
      throw BalanceException("Insufficient Balance")
    }
  }
    catch(e:BalanceException){
      println(e.message)

    }
    finally{
      println("Transaction Failed")
    }
  }
