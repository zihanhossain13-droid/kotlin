fun processNumbers(numbers:List<Int>,operation:(Int)->Int):List<Int>{
  return numbers.map(operation)
}
fun main(){
  val numbers = listOf(10, 15, 20, 25, 30)
  val result=processNumbers(numbers){
    it+10
  }
  println(result)
}