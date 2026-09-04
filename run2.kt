fun getNameInfo(name: String?): String {
  return name?.run{
     "Hello $this"
    
  }?:"Hello Guest"
}
fun main()
{
  val name:String?="ZIhan"
  val result=getNameInfo(name)
  println(result)
}