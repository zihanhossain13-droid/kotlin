fun countLongNames(names: List<String>): Int {
    return names.count{
      it.length>=5
    }
}
fun main(){
  val names = listOf("Zihan", "Rahim", "Karim", "Ali", "Mahfuz")
  val result=countLongNames(names)
  println(result)
}