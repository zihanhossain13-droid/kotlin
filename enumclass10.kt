enum class PaymentMethod{
  
  CASH{
    override fun getMessage():String{
return "Pay using CASH"
    }

  },
  CARD{
    override fun getMessage():String{
      return "Pay using CARD"
    }
  },
  BKASH{
    override fun getMessage():String{
      return "Pay using BKASH"
    }
  },
  NAGAD{
    override fun getMessage():String{
      return "Pay using NAGAD"
    }
  };
  abstract fun getMessage():String
}
fun main(){
  val method:PaymentMethod=PaymentMethod.BKASH
  println(method.getMessage())


}