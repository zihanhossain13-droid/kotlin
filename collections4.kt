fun getEvenNumbers(names: List<String>): List<String> {
    return names.filter{it.length>=5}
}
fun main(){
  val names = listOf("Zihan", "Rahim", "Karim", "Mahfuz", "Ali")
  val result=getEvenNumbers(names)
  println(result)
}