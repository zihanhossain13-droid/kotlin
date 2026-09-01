fun String.isValidEmail():Boolean{
    if(this.contains("@") && this.endsWith(".com")){
        return true
    }else{
        return false
    }
    
}
fun main(){
    val result="Zihan".isValidEmail()
    println(result)

}