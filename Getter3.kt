class BankAccount(
    var accountHolder:String,
    balance:Int

){
    var newBalance:Int=balance
    get(){
        if(field >= 100000){
            println("VIP Account")
        }
        else if(field >= 50000){
            println("Premium Account")
        }
        else if(field < 50000){
            println("Regular Account")
        }
        return field
    }

}
fun main(){
    var p=BankAccount(accountHolder="Zihan",balance=300000000)
    println(p.newBalance)
}