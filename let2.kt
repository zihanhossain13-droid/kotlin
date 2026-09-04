fun getNameInfo(name: String): String {
    return name.let{
      "Name:$it Length:${it.length}"
    }
}
fun main(){
  val name="Zihan"
  val result=getNameInfo(name)
  println(result)
}