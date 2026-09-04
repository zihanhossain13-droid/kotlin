fun processName(name: String): String {
    return name.let{
      it.uppercase()
    }
}
fun main(){
  val name="zihan"
  val result=processName(name)
  println(result)
}