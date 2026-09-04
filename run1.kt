fun getNameInfo(name: String): String {
  return name.run{
    "Name:$this,Length:${this.length}"
  }
}
fun main()
{
  val name="ZIhan"
  val result=getNameInfo(name)
  println(result)
}