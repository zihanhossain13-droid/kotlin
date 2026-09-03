fun processNumbers(numbers:List<Int>,operation:(Int)->Boolean):List<Int>{
  return numbers.filter(operation)
}
fun main(){
  val numbers = listOf(10, 15, 20, 25, 30)
  val result=processNumbers(numbers){
    it%2==0
  }
  println(result)
}