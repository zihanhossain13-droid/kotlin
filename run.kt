fun getNameLength(name: String): Int {
    return name.run{
      this.length
    }
}
fun main(){
  val name="Zihan"
  val result=getNameLength(name)
  println(result)
}