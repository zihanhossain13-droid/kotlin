fun getNameLength(name: String): Int {
    return name.let{
      it.length
    }
}
fun main(){
  val name = "Zihan"
  val result=getNameLength(name)
  println(result)
}