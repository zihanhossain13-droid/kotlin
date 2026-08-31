enum class PaymentMethod(
  val fee:Double
  
){
  CASH(0.0),
  CARD(2.0),
  BKASH(1.5),
  NAGAD(1.4)
}
fun main(){
  val method:PaymentMethod=PaymentMethod.BKASH
  val amount=1000.0
  val feeamount=amount*method.fee/100
  val finalamount=amount+feeamount
  when(method){
    PaymentMethod.CASH->{println("Pay with CASH")
    println(method.fee)

    }
    PaymentMethod.CARD->{println("Pay with CARD")
    println(method.fee)
    }
    PaymentMethod.BKASH->{println("Pay with BKASH")
    println(method.fee)
    }
    PaymentMethod.NAGAD->{println("Pay with NAGAD")
    println(method.fee)
    }
  }
  println(feeamount)
    println(finalamount)
  println(method.name)
  println(method.ordinal)
}