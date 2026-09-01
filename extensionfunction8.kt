fun String?.safeLength():Int{
  if(this==null){
    return 0
  }else{
    return this.length
  }
}
fun main(){
  val result:String?="Zihan"
  println(result.safeLength())
}